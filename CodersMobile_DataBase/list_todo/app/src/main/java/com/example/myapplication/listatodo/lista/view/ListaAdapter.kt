package com.example.myapplication.listatodo.lista.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.listatodo.R
import com.example.myapplication.listatodo.lista.entity.ListaEntity

class ListaAdapter () :
RecyclerView.Adapter<ListaViewHolder>() {

    private var _lista: MutableList<ListaEntity> = mutableListOf()

    fun adicionarTarefa(lista: ListaEntity){
        _lista.add(lista)
        notifyDataSetChanged()
    }

    fun adcionarLista(lista: List<ListaEntity>){
        _lista.addAll(lista)
        notifyDataSetChanged()
    }

    fun atualizar(listaEntity: ListaEntity){
        for(lista in _lista){
            if(lista.id == listaEntity.id){
                lista.nome = listaEntity.nome
                break
            }
        }
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return ListaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaViewHolder, position: Int) {
        val item = _lista[position]
        holder.bind(item)
    }

    override fun getItemCount() = _lista.size
}