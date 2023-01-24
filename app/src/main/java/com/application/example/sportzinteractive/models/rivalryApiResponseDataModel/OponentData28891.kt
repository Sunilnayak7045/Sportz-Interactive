package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class OponentData28891 (

  @SerializedName("Position"  ) var Position  : String?  = null,
  @SerializedName("Name_Full" ) var NameFull  : String?  = null,
  @SerializedName("Iscaptain" ) var Iscaptain : Boolean? = null,
  @SerializedName("Batting"   ) var Batting   : Batting? = Batting(),
  @SerializedName("Bowling"   ) var Bowling   : Bowling? = Bowling()

): Parcelable