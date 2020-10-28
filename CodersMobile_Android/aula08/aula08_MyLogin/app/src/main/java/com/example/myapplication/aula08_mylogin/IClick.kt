package com.example.myapplication.aula08_mylogin

import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment

interface IClick {
    fun clickSetToast(valor: Int, mensagem: String)
    fun clickSetToastLogin(valorLogin: Int, mensagemLogin: String)
    fun clickNewTab(index: Int)
    fun userNameAlterado (username: String)
}