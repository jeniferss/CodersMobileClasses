package com.example.myapplication.listatodo.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.listatodo.lista.dao.ListaDao
import com.example.myapplication.listatodo.lista.entity.ListaEntity

@Database(
    entities = [ListaEntity::class],
    version = 1,
    exportSchema = false
)

abstract class DataBase: RoomDatabase() {

    abstract fun listaDao(): ListaDao

    companion object {

        private var INSTANCE: DataBase? = null

        fun getDatabase(context: Context): DataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "listatodo"
                ).build()
            }

            return INSTANCE!!
        }
    }


}