package com.example.myapplication.aula08_mylogin

import android.content.Context
import android.os.Bundle
import android.text.BoringLayout.make
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*
import javax.microedition.khronos.egl.EGL

const val ERROR_VAZIO = "Campo Vazio"
const val ERROR_LOGIN = "Usúario não encontrado"
const val SUCSESS_LOGIN = "Deu Match!"

class LoginFragment : Fragment() {

    lateinit var iClick: IClick
    lateinit var viewLogin: View

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iClick = context as IClick
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewLogin = inflater.inflate(R.layout.fragment_login, container, false)
        verificarLogin(viewLogin)
        return viewLogin
    }

    fun verificarLogin (view: View){
        view.btnLogin.setOnClickListener {

            val username = view.etUsername.text.toString()
            val password = view.etPassword.text.toString()


            if (username.trim().isEmpty()) {
                view.findViewById<EditText>(R.id.etUsername).error = ERROR_VAZIO
            }

            if (password.trim().isEmpty()) {
                view.findViewById<EditText>(R.id.etPassword).error = ERROR_VAZIO
            } else {
                val user = UserActions.logIn(username, password)

                if (user != null) {
                    iClick.clickSetToastLogin(1, SUCSESS_LOGIN)
                    etUsername.text?.clear()
                    etPassword.text?.clear()
                } else {
                    iClick.clickSetToastLogin(2, ERROR_LOGIN)
                    etUsername.text?.clear()
                    etPassword.text?.clear()
                }
            }
        }
    }

    fun userNameAlterado(username: String){
        val edtUserName = viewLogin.findViewById<TextInputEditText>(R.id.etUsername)
        edtUserName.setText(username)
        val passWord = viewLogin.findViewById<TextInputEditText>(R.id.etPassword)
        passWord.requestFocus()
    }
}