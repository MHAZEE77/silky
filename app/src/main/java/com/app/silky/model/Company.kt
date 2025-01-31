package com.app.silky.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Company (

  val name : String,
  val catchPhrase : String,
  val bs : String
) : Parcelable