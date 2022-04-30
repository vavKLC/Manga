package com.example.manga.ui.fragment

import com.example.manga.base.BaseViewModel
import com.example.manga.data.dtos.MangaModel
import com.example.manga.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(private val mangaRepository: MangaRepository) :
    BaseViewModel() {
    private val _mangaState = mutableUIStateFlow<List<MangaModel>>()
    val mangaState = _mangaState.asStateFlow()

    fun fetchManga() {
        mangaRepository.fetchManga().collectRequest(_mangaState)
    }

    init {
        fetchManga()
    }
}