package com.example.myapplication.revisaowebservice.listagem.repository

import com.example.myapplication.revisaowebservice.api.NetworkUtils
import retrofit2.http.GET

interface CategoryEndpoint {

    @GET("categories")
    suspend fun obterLista(): List<String>

    companion object {
        val endpoint: CategoryEndpoint by lazy {
            NetworkUtils.NetworkUtils.getRetrofitInstance().create(CategoryEndpoint::class.java)
        }
    }
}