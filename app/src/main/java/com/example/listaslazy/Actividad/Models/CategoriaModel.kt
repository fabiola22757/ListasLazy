package com.example.listaslazy.Actividad.Models

import androidx.annotation.DrawableRes

data class CategoriaModel(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int
)
