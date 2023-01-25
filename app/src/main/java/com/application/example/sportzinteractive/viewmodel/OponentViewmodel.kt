package com.application.example.sportzinteractive.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel
import com.application.example.sportzinteractive.network.APIClient
import com.application.example.sportzinteractive.network.APIInterface
import com.application.example.sportzinteractive.repository.OponentRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OponentViewmodel(private val repository: OponentRepository) : ViewModel() {

    init {

        viewModelScope.launch(Dispatchers.IO) {
            repository.getRivalry()
        }
        viewModelScope.launch(Dispatchers.IO) {
            repository.getRivalryOfAnotherMatch()
        }
    }

    val rivalryOponent: LiveData<RivalryApiResponseDataModel>
        get() = repository.oponent

    val rivalryOponentOfAnotherMatch: LiveData<RivalryApiResponseDataModel>
        get() = repository.oponentOfAnotherMatch


}