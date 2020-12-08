package com.example.myapplication.listatodo.lista.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.listatodo.R
import com.example.myapplication.listatodo.db.DataBase
import com.example.myapplication.listatodo.lista.dao.ListaDao
import com.example.myapplication.listatodo.lista.entity.ListaEntity
import com.example.myapplication.listatodo.lista.repository.ListaRepository
import com.example.myapplication.listatodo.lista.viewmodel.ListaViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var _viewModel: ListaViewModel
    private  lateinit var _listaAdapter : ListaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaRecycler = findViewById<RecyclerView>(R.id.lista)
        val manager = LinearLayoutManager(this)

        _listaAdapter = ListaAdapter()

        _viewModel = ViewModelProvider(
            this,
            ListaViewModel.ListaViewModelFacytory(ListaRepository(DataBase.getDatabase(this).listaDao()))
        ).get(ListaViewModel::class.java)

        listaRecycler.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = _listaAdapter
        }

        inicializar()
        actions()

    }

    private fun inicializar(){
        _viewModel.getLista().observe(this, {
            _listaAdapter.adcionarLista(it)
        })
    }

    private fun actions(){
        findViewById<Button>(R.id.btnAdciona).setOnClickListener {
            val newTarefa = findViewById<EditText>(R.id.etTarefa)
            val nome = newTarefa.text.toString()
            newTarefa.setText("")

            val params = nome.split(",")

            if(params.size > 1){
                _viewModel.atualizarLista(params[0].toLong(), params[1]).observe(this, {
                    _listaAdapter.atualizar(ListaEntity(params[0].toLong(), params[1]))
                })
            } else {
                _viewModel.iserirLista(nome).observe(this, {
                    _listaAdapter.adicionarTarefa(it)
                })
            }
        }
    }

}