package com.example.myapplication.listatodo.lista.repository

import com.example.myapplication.listatodo.lista.dao.ListaDao
import com.example.myapplication.listatodo.lista.entity.ListaEntity

class ListaRepository(private val listaDao: ListaDao) {

    suspend fun addLista(lista: ListaEntity) = listaDao.addLista(lista)
    suspend fun getLista(): List<ListaEntity> = listaDao.getLista()
    suspend fun atualizarLista(nome: String, id:Long) = listaDao.atualizarLista(nome, id)

}