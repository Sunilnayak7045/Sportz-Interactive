package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize

data class PowerPlay (

  @SerializedName("PP1" ) var PP1 : String? = null,
  @SerializedName("PP2" ) var PP2 : String? = null

): Parcelable