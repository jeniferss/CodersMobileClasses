package com.example.myapplication.revisaowebservice.showjoke.repository

class JokeRepository() {
    private val _client = JokeEndpoint.endpoint
    suspend fun obterJoke(category: String) = _client.obterJoke(category)
}