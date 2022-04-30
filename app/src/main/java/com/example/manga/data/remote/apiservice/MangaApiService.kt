package com.example.manga.data.remote.apiservice

import com.example.manga.data.dtos.MangaModel
import retrofit2.http.GET

interface MangaApiService {

    @GET("people")
    suspend fun fetchManga(): List<MangaModel>
}