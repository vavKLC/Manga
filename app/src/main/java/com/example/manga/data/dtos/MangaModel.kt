package com.example.manga.data.dtos

import com.example.manga.base.BaseDiffUtilModel
import com.google.gson.annotations.SerializedName

data class MangaModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("age")
    val age: String,
    @SerializedName("eye_color")
    val eye_color: String,
    @SerializedName("hair_color")
    val hair_color: String,
    @SerializedName("films")
    val films: List<String>,
    @SerializedName("species")
    val species: String,
    @SerializedName("url")
    val url: String
    ): BaseDiffUtilModel

