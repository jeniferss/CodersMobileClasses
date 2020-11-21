package com.example.myapplication.revisaowebservice.showjoke.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.revisaowebservice.R
import com.example.myapplication.revisaowebservice.listagem.repository.CategoryRepository
import com.example.myapplication.revisaowebservice.listagem.viewmodel.CategoryViewModel
import com.example.myapplication.revisaowebservice.showjoke.model.JokeModel
import com.example.myapplication.revisaowebservice.showjoke.repository.JokeRepository
import com.example.myapplication.revisaowebservice.showjoke.viewmodel.JokeViewModel
import com.squareup.picasso.Picasso

class JokeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joke)

        lateinit var _viewModel: JokeViewModel
        val icon = findViewById<ImageView>(R.id.imagem)
        val texto = findViewById<TextView>(R.id.tvJoke)
        val category: String = intent.getStringExtra("CATEGORY")!!

        _viewModel = ViewModelProvider(
            this,
            JokeViewModel.JokeViewModelFactory(JokeRepository())
        ).get(JokeViewModel::class.java)

        _viewModel.obterJoke(category).observe(this, {

            texto.text = it.value

            Picasso.get()
                .load(it.icon_url)
                .into(icon)
        })
    }
}