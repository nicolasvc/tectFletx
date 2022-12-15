package com.example.tectfletx.framework.server.response

data class ResponseVehicleServer(
    val `data`: List<DataServer>,
    val message: String,
    val success: Boolean
)