package com.example.myapplication.aula06_reciclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val dataSet: List<String>): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val texto by lazy { view.findViewById<TextView>(R.id.meuTexto)}

        fun bind(string: String){
            texto.text = string
        }
    }

    //inflar o xml(a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista,parent,false) // qual item inflar
        return MeuViewHolder(view)
    }

    // quantidade de intens do meu DataSet
    override fun getItemCount() = dataSet.size

    // vai ser chamada a cada item do DataSet / Popular elementos
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}