package com.example.myapplication.aula05_calculaidadefragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_entrada.*
import kotlinx.android.synthetic.main.fragment_entrada.view.*
import kotlinx.android.synthetic.main.fragment_saida.*
import java.util.*

const val ERROR = "Campo Vazio"

class EntradaFragment : Fragment() {

    lateinit var iMostrar: IMostrar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_entrada, container, false)

        view.btnCalcular.setOnClickListener {

            if(txtNome.text.isEmpty()) txtNome.error = ERROR
            else if(txtAnoNasc.text.isEmpty()) txtAnoNasc.error = ERROR
            else {
                val nome = txtNome.text.toString()
                val ano = txtAnoNasc.text.toString().toInt()
                val anoAtual = Calendar.getInstance().get(Calendar.YEAR)
                val idade = anoAtual - ano
                iMostrar.mostraDado(nome, idade)
            }
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iMostrar = context as IMostrar
    }
}