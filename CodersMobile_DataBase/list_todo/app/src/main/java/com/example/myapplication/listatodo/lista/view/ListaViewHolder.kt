package com.example.myapplication.listatodo.lista.view

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.listatodo.R
import com.example.myapplication.listatodo.lista.entity.ListaEntity
import kotlinx.android.synthetic.main.activity_main.view.*

class ListaViewHolder (_view: View) : RecyclerView.ViewHolder(_view) {

    var nome = _view.findViewById<TextView>(R.id.txtLista).text
    var id = _view.findViewById<TextView>(R.id.txtID).text

    fun bind(listaModel: ListaEntity) {
        nome = listaModel.nome
        id = listaModel.id.toString()
    }
}