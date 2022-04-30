package com.example.manga.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtil<T: BaseDiffUtilModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean =
        oldItem == newItem
}