package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Bowlers (

  @SerializedName("Bowler"      ) var Bowler      : String? = null,
  @SerializedName("Overs"       ) var Overs       : String? = null,
  @SerializedName("Maidens"     ) var Maidens     : String? = null,
  @SerializedName("Runs"        ) var Runs        : String? = null,
  @SerializedName("Wickets"     ) var Wickets     : String? = null,
  @SerializedName("Economyrate" ) var Economyrate : String? = null,
  @SerializedName("Noballs"     ) var Noballs     : String? = null,
  @SerializedName("Wides"       ) var Wides       : String? = null,
  @SerializedName("Dots"        ) var Dots        : String? = null

): Parcelable