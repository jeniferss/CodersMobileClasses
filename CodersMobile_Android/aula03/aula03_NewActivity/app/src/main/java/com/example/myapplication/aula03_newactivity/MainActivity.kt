package com.example.myapplication.aula03_newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClique.setOnClickListener {
            //Iniciar nova Tela
            val intent = Intent(this, NovaTela::class.java)
            //Eviar info
            intent.putExtra("NOME", "JENIFER")
            startActivity(intent)
            //Mostrar Toast (obilongo flutuante)
            Toast.makeText(this,"CLICOU NÉ", Toast.LENGTH_SHORT).show()
        }
    }
}