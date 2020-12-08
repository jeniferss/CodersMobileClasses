package com.example.myapplication.listatodo.lista.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.myapplication.listatodo.lista.entity.ListaEntity
import com.example.myapplication.listatodo.lista.repository.ListaRepository
import kotlinx.coroutines.Dispatchers

class ListaViewModel (private val _repository: ListaRepository): ViewModel() {

    fun iserirLista(nome: String) = liveData(Dispatchers.IO){
        val lista = ListaEntity(0, nome)
        val newId = _repository.addLista(ListaEntity(0, nome))
        emit(lista)
    }

    fun getLista() = liveData(Dispatchers.IO){
        emit(_repository.getLista())
    }

    fun atualizarLista(id: Long, nome: String) = liveData(Dispatchers.IO){
        _repository.atualizarLista(nome, id)
        emit(true)
    }



    class ListaViewModelFacytory(private val _repository: ListaRepository):
        ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ListaViewModel(_repository) as T
        }
    }

}