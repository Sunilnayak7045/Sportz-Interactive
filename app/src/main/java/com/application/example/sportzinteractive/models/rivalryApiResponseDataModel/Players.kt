package com.application.example.sportzinteractive.models.rivalryApiResponseDataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Players (

  @SerializedName("3667"  ) var OponentData3667  : OponentData3667?  = OponentData3667(),
  @SerializedName("4356"  ) var OponentData4356  : OponentData4356?  = OponentData4356(),
  @SerializedName("5313"  ) var OponentData5313  : OponentData5313?  = OponentData5313(),
  @SerializedName("12518" ) var OponentData12518 : OponentData12518? = OponentData12518(),
  @SerializedName("24669" ) var OponentData24669 : OponentData24669? = OponentData24669(),
  @SerializedName("28891" ) var OponentData28891 : OponentData28891? = OponentData28891(),
  @SerializedName("48191" ) var OponentData48191 : OponentData48191? = OponentData48191(),
  @SerializedName("57458" ) var OponentData57458 : OponentData57458? = OponentData57458(),
  @SerializedName("59736" ) var OponentData59736 : OponentData59736? = OponentData59736(),
  @SerializedName("63611" ) var OponentData63611 : OponentData63611? = OponentData63611(),
  @SerializedName("64221" ) var OponentData64221 : OponentData64221? = OponentData64221()

): Parcelable