package com.example.manga.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.manga.base.BaseDiffUtil
import com.example.manga.data.dtos.MangaModel
import com.example.manga.databinding.ItemMangaBinding

class MangaAdapter : ListAdapter<MangaModel, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MangaViewHolder =
        MangaViewHolder(
            ItemMangaBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MangaAdapter.MangaViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: MangaModel) {
            binding.startDateTv.text = data.name
            binding.endDateTv.text = data.age
        }

    }

}
