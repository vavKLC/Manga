package com.example.manga.di

import com.example.manga.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    private val retrofit = RetrofitClient()

    @Singleton
    @Provides
    fun provideMangaApiService() = retrofit.provideMangaApiService()
}