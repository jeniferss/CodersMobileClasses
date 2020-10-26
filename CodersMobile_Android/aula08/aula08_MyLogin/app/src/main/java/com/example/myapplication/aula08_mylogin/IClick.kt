package com.example.myapplication.aula08_mylogin

import android.view.View
import androidx.fragment.app.Fragment

interface IClick {
    fun clickSetToast(valor: Int, mensagem: String)
    fun clickSetToastLogin(valorLogin: Int, mensagemLogin: String)
}