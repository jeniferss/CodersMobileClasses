package com.digitalhouse.rickapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.persona_view.*


class PersonagemHolder(view: View): RecyclerView.ViewHolder(view) {

    private val imagemPersonagem: ImageView = view.findViewById(R.id.imagem_persona)


    fun bind(personagem: Personagem){
        Picasso.get()
            .load(personagem.imagemUrl)
            .into(imagemPersonagem)
    }

}