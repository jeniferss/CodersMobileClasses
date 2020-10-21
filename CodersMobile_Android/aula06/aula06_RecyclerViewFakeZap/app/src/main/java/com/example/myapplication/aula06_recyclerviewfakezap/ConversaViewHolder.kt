package com.example.myapplication.aula06_recyclerviewfakezap

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ConversaViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val nome: TextView = view.findViewById(R.id.txtNome)
    private val mensagem: TextView = view.findViewById(R.id.txtMensagem)
    private val hora: TextView = view.findViewById(R.id.txtHora)

    fun bind (conversa: Conversa){
        nome.text = conversa.nome
        mensagem.text = conversa.mensagem
        hora.text = conversa.data
    }
}