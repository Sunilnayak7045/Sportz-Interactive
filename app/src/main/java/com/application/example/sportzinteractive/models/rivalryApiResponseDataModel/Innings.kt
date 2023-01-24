package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.application.example.sportzinteractive.models.rivalryApiResponseDataModel.Batsmen
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Innings (

  @SerializedName("Number"              ) var Number             : String?                  = null,
  @SerializedName("Battingteam"         ) var Battingteam        : String?                  = null,
  @SerializedName("Total"               ) var Total              : String?                  = null,
  @SerializedName("Wickets"             ) var Wickets            : String?                  = null,
  @SerializedName("Overs"               ) var Overs              : String?                  = null,
  @SerializedName("Runrate"             ) var Runrate            : String?                  = null,
  @SerializedName("Byes"                ) var Byes               : String?                  = null,
  @SerializedName("Legbyes"             ) var Legbyes            : String?                  = null,
  @SerializedName("Wides"               ) var Wides              : String?                  = null,
  @SerializedName("Noballs"             ) var Noballs            : String?                  = null,
  @SerializedName("Penalty"             ) var Penalty            : String?                  = null,
  @SerializedName("AllottedOvers"       ) var AllottedOvers      : String?                  = null,
  @SerializedName("Batsmen"             ) var Batsmen            : ArrayList<Batsmen>       = arrayListOf(),
  @SerializedName("Partnership_Current" ) var PartnershipCurrent : PartnershipCurrent?      = PartnershipCurrent(),
  @SerializedName("Bowlers"             ) var Bowlers            : ArrayList<Bowlers>       = arrayListOf(),
  @SerializedName("FallofWickets"       ) var FallofWickets      : ArrayList<FallofWickets> = arrayListOf(),
  @SerializedName("PowerPlay"           ) var PowerPlay          : PowerPlay?               = PowerPlay()

) : Parcelable