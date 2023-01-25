package com.application.example.sportzinteractive.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel
import com.application.example.sportzinteractive.network.APIInterface
import com.google.gson.Gson

class OponentRepository(private val rivalryApiService: APIInterface) {



    private val rivalryLiveData = MutableLiveData<RivalryApiResponseDataModel>()
    val oponent: LiveData<RivalryApiResponseDataModel>
        get() = rivalryLiveData

    private val rivalryLiveDataOfAnotherMatch = MutableLiveData<RivalryApiResponseDataModel>()
    val oponentOfAnotherMatch: LiveData<RivalryApiResponseDataModel>
        get() = rivalryLiveDataOfAnotherMatch

    suspend fun getRivalry() {
        val result = rivalryApiService.getRivalryDetails()

        if (result.body() != null && result.isSuccessful) {
            rivalryLiveData.postValue(result.body())
        }
    }
    suspend fun getRivalryOfAnotherMatch() {
        val result = rivalryApiService.getRivalry()

        if (result.body() != null && result.isSuccessful) {
            rivalryLiveDataOfAnotherMatch.postValue(result.body())
        }
    }

    companion object{
        private const val TAG = "OponentRepository"
    }
}