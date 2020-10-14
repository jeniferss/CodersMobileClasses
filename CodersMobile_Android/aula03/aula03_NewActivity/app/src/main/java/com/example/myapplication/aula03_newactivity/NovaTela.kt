package com.example.myapplication.aula03_newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nova_tela.*

class NovaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela)
        val nome = intent.getStringArrayExtra("NOME").toString()

        tvNome.text = nome
    }
}