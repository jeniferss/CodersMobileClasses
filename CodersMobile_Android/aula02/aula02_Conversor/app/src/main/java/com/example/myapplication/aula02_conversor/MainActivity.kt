package com.example.myapplication.aula02_conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnConverter.setOnClickListener {

           val temperaturaInserida = temperaturaInserida.text.toString().toInt()

           temperaturaConvertida.text = (((temperaturaInserida * 9 / 5) + 32).toString() + " ºF")
       }
    }
}