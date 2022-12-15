package com.example.usecases

import com.example.data.repository.VehicleRepository

class GetVehiclesUseCase(
    private val vehicleRepository: VehicleRepository
) {

    suspend operator fun invoke() = vehicleRepository.getVehicle()
}