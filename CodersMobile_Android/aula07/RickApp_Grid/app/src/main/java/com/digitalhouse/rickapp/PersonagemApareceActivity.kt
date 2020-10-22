package com.digitalhouse.rickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_personagem_aparece.*
import kotlinx.android.synthetic.main.persona_view.*

class PersonagemApareceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem_aparece)
         val imagemPersonagem = intent.getStringExtra("IMAGEM")
        txtGenero.text = intent.getStringExtra("GENERO")
        txtPlaneta.text = intent.getStringExtra("PAIS")
        txtNomeActivity.text = intent.getStringExtra("NOME")

        Picasso.get()
            .load(imagemPersonagem)
            .into(imagemPersonagemActivity)
    }
}