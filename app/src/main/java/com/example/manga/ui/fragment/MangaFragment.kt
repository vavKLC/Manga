package com.example.manga.ui.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.manga.R
import com.example.manga.base.BaseFragment
import com.example.manga.common.extensions.submitData
import com.example.manga.databinding.FragmentMangaBinding
import com.example.manga.ui.adapter.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class  MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(
    R.layout.fragment_manga
) {
    override val viewModel: MangaViewModel by viewModels()
    override val binding by viewBinding(FragmentMangaBinding::bind)
    private val mangaAdapter = MangaAdapter()

    override fun setupSubscribe() {
        viewModel.mangaState.collectUIState(
            error = {
                Log.e("error", it)
            },
            success = {
                mangaAdapter.submitData(it)
                Log.e("success", it.toString())
            }
        )
    }

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerView.apply {
            adapter = mangaAdapter
        }
    }
}