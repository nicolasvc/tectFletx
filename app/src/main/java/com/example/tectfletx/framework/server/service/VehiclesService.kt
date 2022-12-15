package com.example.tectfletx.framework.server.service

import com.example.tectfletx.framework.server.response.ResponseVehicleServer
import com.example.tectfletx.util.ConstService.ROUTE_SEARCH_VEHICLES
import retrofit2.http.GET
import retrofit2.http.Header

interface VehiclesService {

    @GET(ROUTE_SEARCH_VEHICLES)
    suspend fun getVehicles(@Header("Authorization") auth:String): ResponseVehicleServer


}