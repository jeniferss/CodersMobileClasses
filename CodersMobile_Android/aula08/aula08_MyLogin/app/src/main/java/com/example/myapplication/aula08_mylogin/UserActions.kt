package com.example.myapplication.aula08_mylogin

import java.lang.Exception

class UserActions {
    companion object {

        private val users = arrayListOf<UserData>()

        /**
         * Realiza login
         */

        fun logIn(username: String, password: String?): UserData? {
            return users.find {
                it.username == username.toLowerCase().trim()  && it.password == password
            }
        }

        /**
         * Registra um usuário
         */

        fun register(username: String, password: String) {
            // Verifica se já existe usuário com email cadastrado
            val user = users.find {
                it.username == username.toLowerCase().trim()
            }

            if (user != null) {
                throw Exception("E-mail já cadastrado!")
            }

            users.add(UserData(username.toLowerCase().trim(), password))
        }
    }
}