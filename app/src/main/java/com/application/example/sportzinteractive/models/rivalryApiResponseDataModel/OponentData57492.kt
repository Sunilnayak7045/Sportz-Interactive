package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import com.google.gson.annotations.SerializedName


data class OponentData57492 (

  @SerializedName("Position"  ) var Position : String?  = null,
  @SerializedName("Name_Full" ) var NameFull : String?  = null,
  @SerializedName("Batting"   ) var Batting  : Batting? = Batting(),
  @SerializedName("Bowling"   ) var Bowling  : Bowling? = Bowling()

)