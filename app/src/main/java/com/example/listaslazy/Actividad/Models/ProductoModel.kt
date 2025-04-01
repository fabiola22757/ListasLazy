package com.example.listaslazy.Actividad.Models

import androidx.annotation.DrawableRes

data class ProductoModel(
    val id: Int,
    @DrawableRes val image: Int,
    val precio: String, //double
    val nombre_prod: String,
    val envio: String,
    val descuento: String
)
