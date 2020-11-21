package com.example.myapplication.revisaowebservice.listagem.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.revisaowebservice.R
import com.example.myapplication.revisaowebservice.listagem.repository.CategoryRepository
import com.example.myapplication.revisaowebservice.listagem.viewmodel.CategoryViewModel
import com.example.myapplication.revisaowebservice.showjoke.view.JokeActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var _viewModel: CategoryViewModel
    private lateinit var _categoryAdapter: CategoryAdapter
    private var _listaString = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryRecycler = findViewById<RecyclerView>(R.id.recyclerCategorias)
        val manager = LinearLayoutManager(this)

        _listaString = mutableListOf()
        _categoryAdapter = CategoryAdapter(_listaString) {
            val intent = Intent(this, JokeActivity::class.java)
            intent.putExtra("CATEGORY", it.decapitalize(Locale.getDefault()))
            startActivity(intent)
        }

        categoryRecycler.apply {
            layoutManager = manager
            adapter = _categoryAdapter
        }

        _viewModel = ViewModelProvider(
            this,
            CategoryViewModel.CategoryViewModelFactory(CategoryRepository())
        ).get(CategoryViewModel::class.java)

        _viewModel.obterLista().observe(this, {
            _listaString.addAll(it)
            _categoryAdapter.notifyDataSetChanged()
        })

    }
}

