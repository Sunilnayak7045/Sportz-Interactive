package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.Batsmen
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize

data class PartnershipCurrent (

  @SerializedName("Runs"    ) var Runs    : String?            = null,
  @SerializedName("Balls"   ) var Balls   : String?            = null,
  @SerializedName("Batsmen" ) var Batsmen : ArrayList<Batsmen> = arrayListOf()

): Parcelable