package com.example.myapplication.revisaowebservice.listagem.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.revisaowebservice.R
import java.util.*

class CategoryAdapter(
    private var _categorias: MutableList<String>,
    private val _listener: (String) -> Unit
) :
    RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.categoria_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val item = _categorias[position].capitalize(Locale.getDefault())
        holder.bind(item)
        holder.itemView.setOnClickListener { _listener(item) }
    }

    override fun getItemCount() = _categorias.size
}