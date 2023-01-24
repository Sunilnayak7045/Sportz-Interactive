package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize

data class Series (

  @SerializedName("Id"        ) var Id       : String? = null,
  @SerializedName("Name"      ) var Name     : String? = null,
  @SerializedName("Status"    ) var Status   : String? = null,
  @SerializedName("Tour"      ) var Tour     : String? = null,
  @SerializedName("Tour_Name" ) var TourName : String? = null

): Parcelable