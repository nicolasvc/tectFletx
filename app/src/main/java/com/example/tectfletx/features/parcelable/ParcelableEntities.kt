package com.example.tectfletx.features.parcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoVehicleParcelable(
    val plate: String,
    val branch: String,
    val color: String,
    val type: String,
    var model:String,
    val latitude:Double,
    val longitude:Double
): Parcelable