package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Teams (

  @SerializedName("6" ) var Oponent6 : Oponent6? = Oponent6(),
  @SerializedName("7" ) var Oponent7 : Oponent7? =Oponent7()

) : Parcelable