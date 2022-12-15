package com.example.tectfletx.features.vehicles

import com.example.data.repository.VehicleRepository
import com.example.usecases.GetVehiclesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class VehicleModule {

    @Provides
    @ViewModelScoped
    fun getVehiclesUseCaseProvider(
        vehicleRepository: VehicleRepository
    ):GetVehiclesUseCase = GetVehiclesUseCase(vehicleRepository)
}