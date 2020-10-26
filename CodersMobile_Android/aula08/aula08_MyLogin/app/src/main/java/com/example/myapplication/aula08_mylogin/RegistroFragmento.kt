package com.example.myapplication.aula08_mylogin

import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_registro_fragmento.*
import kotlinx.android.synthetic.main.fragment_registro_fragmento.view.*
import java.lang.Exception
import kotlin.properties.Delegates

const val SUCESS_REGISTRO = "Usuário Cadastrado com Sucesso!"
const val ERROR_REGISTRO = "Usuário já Cadastrado!"
const val ERROR_SENHAS = "Senhas não conferem!"

class RegistroFragmento : Fragment() {

    var checked = false

    lateinit var iClick: IClick

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iClick = context as IClick
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewRegistro = inflater.inflate(R.layout.fragment_registro_fragmento, container, false)
        validarCampos(viewRegistro)
        return viewRegistro
    }

    fun validarCampos(view: View) {

        view.btnSignUp.setOnClickListener {

            val username = view.etUsernameRegistro.text.toString()
            val password = view.etPasswordRegistro.text.toString()
            val passwordConfirmation = view.etPasswordConfirmation.text.toString()

            if (username.isEmpty()) {
                view.etUsernameRegistro.error = ERROR_VAZIO
            } else if (password.isEmpty()) {
                view.etPasswordRegistro.error = ERROR_VAZIO
            } else if (passwordConfirmation.isEmpty()) {
                view.etPasswordConfirmation.error = ERROR_VAZIO
            } else {
                try {
                    if (password == passwordConfirmation) {
                        UserActions.register(username, password)
                        iClick.clickSetToast(1, SUCESS_REGISTRO)
                        etUsernameRegistro.text?.clear()
                        etPasswordRegistro.text?.clear()
                        etPasswordConfirmation.text?.clear()
                        checked = false
                    } else {
                        iClick.clickSetToast(2, ERROR_SENHAS)
                    }
                } catch (e: Exception) {
                    iClick.clickSetToast(3, ERROR_REGISTRO)
                    etUsernameRegistro.text?.clear()
                    etPasswordRegistro.text?.clear()
                    etPasswordConfirmation.text?.clear()
                }
            }

        }

        view.cbAgree.setOnCheckedChangeListener { _, isChecked ->
           btnSignUp.isEnabled = isChecked
        }
    }

}

