package com.example.myapplication.revisaowebservice.showjoke.repository

import com.example.myapplication.revisaowebservice.api.NetworkUtils
import com.example.myapplication.revisaowebservice.listagem.view.MainActivity
import com.example.myapplication.revisaowebservice.showjoke.model.JokeModel
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeEndpoint {

    @GET("random")
    suspend fun obterJoke(@Query ("category") category: String): JokeModel
    companion object {
        val endpoint: JokeEndpoint by lazy {
            NetworkUtils.NetworkUtils.getRetrofitInstance().create(JokeEndpoint::class.java)
        }
    }
}