package com.example.myapplication.listatodo.lista.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Lista")
data class ListaEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    @ColumnInfo
    var nome: String,
)