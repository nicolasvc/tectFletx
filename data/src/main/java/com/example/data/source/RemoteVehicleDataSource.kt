package com.example.data.source

import arrow.core.Either
import com.example.domain.entities.ResponseVehicleDomain

interface RemoteVehicleDataSource {

    suspend fun getVehicles() : Either<com.example.domain.Error,ResponseVehicleDomain>
}