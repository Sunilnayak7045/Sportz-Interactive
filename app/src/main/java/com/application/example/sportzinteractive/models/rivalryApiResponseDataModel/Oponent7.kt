package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Oponent7 (

  @SerializedName("Name_Full"  ) var NameFull  : String?  = null,
  @SerializedName("Name_Short" ) var NameShort : String?  = null,
  @SerializedName("Players"    ) var Players   : Players? = Players()

): Parcelable