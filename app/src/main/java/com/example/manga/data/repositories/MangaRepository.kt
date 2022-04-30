package com.example.manga.data.repositories

import com.example.manga.base.BaseRepository
import com.example.manga.data.remote.apiservice.MangaApiService
import javax.inject.Inject

class MangaRepository @Inject constructor(
    private val service: MangaApiService
) : BaseRepository() {
    fun fetchManga() = doRequest {
        service.fetchManga()
    }
}