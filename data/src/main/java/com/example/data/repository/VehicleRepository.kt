package com.example.data.repository

import com.example.data.source.RemoteVehicleDataSource

class VehicleRepository(
    private val remoteVehicleDataSource: RemoteVehicleDataSource
) {

    suspend fun getVehicle() = remoteVehicleDataSource.getVehicles()
}