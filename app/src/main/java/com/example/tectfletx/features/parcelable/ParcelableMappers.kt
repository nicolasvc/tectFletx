package com.example.tectfletx.features.parcelable

import com.example.domain.entities.DataDomain

fun DataDomain.toInfoVehicleParcelable(latitude: Double, longitude: Double) = InfoVehicleParcelable(
    placa,
    carmarkDomain.name,
    carcolor.name,
    cartypeDomain.name,
    model.toString(),
    latitude,
    longitude
)