package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Teams (

  @SerializedName("6" ) var Oponent6 : Oponent6? = Oponent6(),
  @SerializedName("7" ) var Oponent7 : Oponent7? =Oponent7() ,
  @SerializedName("4" ) var Oponent4 : Oponent4? = Oponent4(),
  @SerializedName("5" ) var Oponent5 : Oponent5? =Oponent5()

) : Parcelable