package com.application.example.sportzinteractive.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel
import com.application.example.sportzinteractive.repository.OponentRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OponentViewmodel(private val repository: OponentRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getRivalry()
        }
    }

    val rivalryOponent: LiveData<RivalryApiResponseDataModel>
        get() = repository.oponent


}