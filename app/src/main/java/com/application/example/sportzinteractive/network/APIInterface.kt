package com.application.example.sportzinteractive.network

import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.RivalryApiResponseDataModel

import retrofit2.Response
import retrofit2.http.GET

interface APIInterface {


    @GET("nzin01312019187360.json")
    suspend fun getRivalry( ): Response<RivalryApiResponseDataModel>


    @GET("sapk01222019186652.json")
    suspend fun getRivalryDetails( ): Response<RivalryApiResponseDataModel>
}