package com.application.example.sportzinteractive.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel
import com.application.example.sportzinteractive.network.APIInterface

class OponentRepository(private val rivalryApiService: APIInterface) {


    private val rivalryLiveData = MutableLiveData<RivalryApiResponseDataModel>()
    val oponent: LiveData<RivalryApiResponseDataModel>
        get() = rivalryLiveData

    suspend fun getRivalry() {
        val result = rivalryApiService.getRivalryDetails()

        if (result?.body() != null) {
            rivalryLiveData.postValue(result.body())
        }
    }

}