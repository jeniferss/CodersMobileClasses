package com.example.myapplication.revisaowebservice.listagem.repository

class CategoryRepository {

    private val _client = CategoryEndpoint.endpoint
    suspend fun obterLista() = _client.obterLista()
}