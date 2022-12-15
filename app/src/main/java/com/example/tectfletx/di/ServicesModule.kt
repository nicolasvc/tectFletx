package com.example.tectfletx.di

import com.example.tectfletx.framework.server.service.VehiclesService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


@Module
@InstallIn(SingletonComponent::class)
class ServicesModule {

    @Provides
    fun providesVehicleService(retrofit: Retrofit): VehiclesService =
        retrofit.create(VehiclesService::class.java)

}