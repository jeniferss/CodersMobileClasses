package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_welcome.*

const val ERROR_LOGIN = "ERRO! Usuário não cadastrado"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccountLogin.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {

            val emailLoginL = emailLogin.text.toString()
            val senhaLogin = passwordLogin.text.toString()

            val usuario = UserService.logIn(emailLoginL, senhaLogin)


            if(usuario != null) {
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("NOME", usuario.name)
                startActivity(intent)
            } else {
                emailLogin.text.clear()
                passwordLogin.text.clear()
                Toast.makeText(this, ERROR_LOGIN, Toast.LENGTH_SHORT).show()
            }
        }

    }
}