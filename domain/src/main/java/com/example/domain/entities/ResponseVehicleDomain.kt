package com.example.domain.entities

data class ResponseVehicleDomain(
    val `data`: List<DataDomain>,
    val message: String, // Listado
    val success: Boolean // true
)