package com.example.myapplication.revisaowebservice.listagem.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.revisaowebservice.R
import kotlinx.android.synthetic.main.activity_joke.view.*

class CategoryViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val _nome = view.findViewById<TextView>(R.id.tvCategoria)

    fun bind(string: String) {
        _nome.text = string
    }
}