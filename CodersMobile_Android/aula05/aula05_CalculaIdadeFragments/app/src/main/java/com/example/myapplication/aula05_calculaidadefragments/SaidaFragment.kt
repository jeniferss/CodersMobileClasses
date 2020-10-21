package com.example.myapplication.aula05_calculaidadefragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_saida.view.*

class SaidaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saida, container, false)
    }

    fun mostrarDado(nome: String, idade: Int): String {
        lateinit var sufixo: String
        return if (idade >= 0) {
            if (idade > 1) {
                sufixo = "anos"
                "$nome, você tem $idade $sufixo"
            } else {
                sufixo = "ano"
                "$nome, você tem $idade $sufixo"
            }
        } else "$nome ainda não nasceu!"
    }
}