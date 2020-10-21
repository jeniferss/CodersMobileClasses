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
    private val nomePersonagem: TextView = view.findViewById(R.id.txt_name_persona)
    private val statusPersonagem: TextView = view.findViewById(R.id.txt_status_persona)
    private val especiePersonagem: TextView = view.findViewById(R.id.txt_especie_persona)
    private val planetaPersonagem: TextView = view.findViewById(R.id.txt_planet_persona)

    fun bind(personagem: Personagem){
        nomePersonagem.text = personagem.nome
        statusPersonagem.text = personagem.status
        especiePersonagem.text = personagem.especie
        planetaPersonagem.text = personagem.localizacao.nome

        Picasso.get()
            .load(personagem.imagemUrl)
            .into(imagemPersonagem)
    }

}