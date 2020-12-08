package com.example.myapplication.listatodo.lista.dao

import androidx.room.*
import com.example.myapplication.listatodo.lista.entity.ListaEntity

@Dao
interface ListaDao {

    @Insert
    suspend fun addLista(lista: ListaEntity)

    @Query("SELECT * FROM Lista")
    suspend fun getLista(): List<ListaEntity>

    @Transaction
    @Query("UPDATE Lista SET nome = :nome Where id = :id")
    fun atualizarLista(nome: String, id:Long)

    @Update @Transaction
    fun atualizarLista(lista: ListaEntity)
}