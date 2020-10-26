package com.example.myapplication.aula08_mylogin

import android.content.Context
import android.os.Bundle
import android.text.BoringLayout.make
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

const val ERROR_VAZIO = "Campo Vazio"
const val ERROR_LOGIN = "Usúario não encontrado"
const val SUCSESS_LOGIN = "Deu Match!"

class LoginFragment : Fragment() {

    lateinit var iClick: IClick

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iClick = context as IClick
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewLogin = inflater.inflate(R.layout.fragment_login, container, false)
        verificarLogin(viewLogin)
        return viewLogin
    }

    fun verificarLogin (view: View){
        view.btnLogin.setOnClickListener {

            val username = view.etUsername.text.toString()
            val password = view.etPassword.text.toString()

            val user = UserActions.logIn(username,password)

            if(user != null){
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