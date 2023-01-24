package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FallofWickets (

  @SerializedName("Batsman" ) var Batsman : String? = null,
  @SerializedName("Score"   ) var Score   : String? = null,
  @SerializedName("Overs"   ) var Overs   : String? = null

): Parcelable