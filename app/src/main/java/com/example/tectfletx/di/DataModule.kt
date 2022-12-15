package com.example.tectfletx.di

import com.example.data.repository.VehicleRepository
import com.example.data.source.RemoteVehicleDataSource
import com.example.tectfletx.framework.server.service.VehiclesService
import com.example.tectfletx.framework.server.source.RemoteVehicleDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun remoteVehicleDataSourceProvider(
        vehiclesService: VehiclesService
    ): RemoteVehicleDataSource = RemoteVehicleDataSourceImpl(vehiclesService)


    @Provides
    fun vehicleRepositoryProvider(
        remoteVehicleDataSource: RemoteVehicleDataSource
    ): VehicleRepository = VehicleRepository(remoteVehicleDataSource)
}