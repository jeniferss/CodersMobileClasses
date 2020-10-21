package com.example.myapplication.aula06_recyclerviewfakezap

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ConversaAdapter(private val conversas: List<Conversa>): RecyclerView.Adapter<ConversaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.conversa_view, parent, false)
        return ConversaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {
        holder.bind(conversas[position])
    }

    override fun getItemCount() = conversas.size

}