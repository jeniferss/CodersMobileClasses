package com.example.myapplication.revisaowebservice.showjoke.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.myapplication.revisaowebservice.showjoke.repository.JokeRepository
import kotlinx.coroutines.Dispatchers

class JokeViewModel(
    private val _repository: JokeRepository
): ViewModel() {


    fun obterJoke(category: String) = liveData(Dispatchers.IO) {
        val response = _repository.obterJoke(category)
        emit(response)
    }

    class JokeViewModelFactory(
        private val _repository: JokeRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return JokeViewModel(_repository) as T
        }
    }



}