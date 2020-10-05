package com.example.myapplication.aula02_calcularsalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {

            val horasTrabalhadas = horasTrabalhadas.text.toString().toInt()
            val valorHora = valorHora.text.toString().toInt()

            val salario = (horasTrabalhadas * valorHora).toFloat()

            txtSalario.text = getString(R.string.strSalario, salario)
        }
    }
}

