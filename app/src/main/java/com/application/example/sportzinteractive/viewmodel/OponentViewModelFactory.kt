package com.application.example.sportzinteractive.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.application.example.sportzinteractive.repository.OponentRepository

class OponentViewModelFactory(private val repository: OponentRepository):  ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return OponentViewmodel(repository) as T
    }
}