package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

const val ERROR_EMPTY = "Campo Vazio"
const val ERROR_GERAL = "ERRO!"
const val  ERROR = "ERRO! Usuário já Cadastrado"
const val sucesso = "Usuário cadastrado!"

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        cbAgree.setOnCheckedChangeListener { _, isChecked ->
            btnSignUpCreateAccount.isEnabled = isChecked
        }

        btnLoginCreateAccount.setOnClickListener {
            finish()
        }

        btnSignUpCreateAccount.setOnClickListener {

            val nome = nameCreateAccount.editText?.text.toString()
            val email = emailCreateAccount.editText?.text.toString()
            val password = passwordCreateAccount.editText?.text.toString()

            if(nome.isEmpty()){
                nameCreateAccount.error = ERROR_EMPTY
                Toast.makeText(this, ERROR_GERAL, Toast.LENGTH_SHORT).show()
            } else if(email.isEmpty()){
                emailCreateAccount.error = ERROR_EMPTY
                Toast.makeText(this, ERROR_GERAL, Toast.LENGTH_SHORT).show()
            } else if(password.isEmpty()){
                passwordCreateAccount.error = ERROR_EMPTY
                Toast.makeText(this, ERROR_GERAL, Toast.LENGTH_SHORT).show()
            } else {
                try {
                    UserService.register(nome, email, password)
                    Toast.makeText(this, sucesso, Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {

                    Snackbar.make(mostrarSnack, "Usuário já cadastrado!", Snackbar.LENGTH_SHORT)
                        .setAction("LOGAR") {
                            finish()
                        }
                        .show()
                }
            }

        }

    }
}