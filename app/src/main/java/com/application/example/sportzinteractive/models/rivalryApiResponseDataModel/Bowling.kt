package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Bowling (

  @SerializedName("Style"       ) var Style       : String? = null,
  @SerializedName("Average"     ) var Average     : String? = null,
  @SerializedName("Economyrate" ) var Economyrate : String? = null,
  @SerializedName("Wickets"     ) var Wickets     : String? = null

): Parcelable