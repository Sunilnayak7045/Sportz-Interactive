package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Notes (

  @SerializedName("1" ) var Highlights1 : ArrayList<String> = arrayListOf(),
  @SerializedName("2" ) var Highlights2 : ArrayList<String> = arrayListOf()

): Parcelable