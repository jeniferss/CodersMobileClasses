package com.digitalhouse.rickapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem

class PersonagemAdapter(private val personagens: List<Personagem>, private  val listener: (Personagem) -> Unit):
    RecyclerView.Adapter<PersonagemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.persona_view, parent, false)

        return PersonagemHolder(view)
    }

    override fun onBindViewHolder(holder: PersonagemHolder, position: Int) {
      val item = personagens[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = personagens.size
    
}