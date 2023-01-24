package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Batting (

  @SerializedName("Style"      ) var Style      : String? = null,
  @SerializedName("Average"    ) var Average    : String? = null,
  @SerializedName("Strikerate" ) var Strikerate : String? = null,
  @SerializedName("Runs"       ) var Runs       : String? = null

): Parcelable