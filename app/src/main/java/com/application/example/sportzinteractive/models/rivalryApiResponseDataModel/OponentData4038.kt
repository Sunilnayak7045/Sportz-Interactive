package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import com.google.gson.annotations.SerializedName


data class OponentData4038 (

  @SerializedName("Position"  ) var Position  : String?  = null,
  @SerializedName("Name_Full" ) var NameFull  : String?  = null,
  @SerializedName("Iscaptain" ) var Iscaptain : Boolean? = null,
  @SerializedName("Iskeeper"  ) var Iskeeper  : Boolean? = null,
  @SerializedName("Batting"   ) var Batting   : Batting? = Batting(),
  @SerializedName("Bowling"   ) var Bowling   : Bowling? = Bowling()

)