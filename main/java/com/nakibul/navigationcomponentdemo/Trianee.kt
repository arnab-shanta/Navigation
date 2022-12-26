package com.nakibul.navigationcomponentdemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Trianee(
    val fistName: String,
    val lastName: String,
    val id: Int
):Parcelable