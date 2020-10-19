package com.example.myapplication.aula05_calculaidadefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_saida.*
import kotlinx.android.synthetic.main.fragment_saida.view.*

class MainActivity : AppCompatActivity(), IMostrar {

    val entradaFragment = EntradaFragment()
    val saidaFragment = SaidaFragment()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentEntrada, entradaFragment)
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentResultado, saidaFragment)
            .commit()
    }

    override fun mostraDado(nome: String, idade:Int) {
        saidaFragment.txtResultado.text = saidaFragment.mostrarDado(nome, idade)
    }

}