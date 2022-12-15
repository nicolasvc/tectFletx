package com.example.tectfletx.framework.server.source

import arrow.core.Either
import com.example.data.source.RemoteVehicleDataSource
import com.example.domain.Error
import com.example.domain.entities.ResponseVehicleDomain
import com.example.tectfletx.framework.server.mappers.toResponseVehicleDomain
import com.example.tectfletx.framework.server.service.VehiclesService
import com.example.tectfletx.util.tryCall

class RemoteVehicleDataSourceImpl(
    private val vehiclesService: VehiclesService
) : RemoteVehicleDataSource {
    override suspend fun getVehicles(): Either<Error, ResponseVehicleDomain> = tryCall {
        val response = vehiclesService.getVehicles("Bearer ab11cb7605a030ee350d08f805057413")
            .toResponseVehicleDomain()
        response
    }


}