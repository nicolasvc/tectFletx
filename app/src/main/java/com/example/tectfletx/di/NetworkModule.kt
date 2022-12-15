package com.example.tectfletx.di

import com.example.tectfletx.util.ConstService.NAME_INJECTION_BASE_URL
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    @Named(NAME_INJECTION_BASE_URL)
    fun providesBaseUrl() :String = "http://st.fletx.co:3000/"


    @Singleton
    @Provides
    fun providesGson(): Gson {
        return Gson()
    }

    @Singleton
    @Provides
    fun providesGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun providesRetrofit(
        gsonConverterFactory: GsonConverterFactory,
        @Named(NAME_INJECTION_BASE_URL) baseUrl: String
    ): Retrofit = Retrofit.Builder()
        .addConverterFactory(gsonConverterFactory)
        .baseUrl(baseUrl)
        .build()

}