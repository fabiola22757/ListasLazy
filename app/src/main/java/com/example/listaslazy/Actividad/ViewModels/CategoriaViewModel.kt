package com.example.listaslazy.Actividad.ViewModels

import androidx.lifecycle.ViewModel
import com.example.listaslazy.Actividad.Models.CategoriaModel
import com.example.listaslazy.R

class CategoriaViewModel() : ViewModel()  {
    fun obtenerCategorias() : List<CategoriaModel>{
        val categoriaUno = CategoriaModel(
            id = 1,
            title = "Supermercado",
            image = R.drawable.supermercado)
        val categoriaDos = CategoriaModel(
            id = 2,
            title = "Tecnología",
            image = R.drawable.tecnologia)
        val categoriaTres = CategoriaModel(
            id = 3,
            title = "Vehículos",
            image = R.drawable.vehiculos)
        val categoriaCuatro = CategoriaModel(
            id = 4,
            title = "Mascotas",
            image = R.drawable.mascotas)
        val categoriaCinco = CategoriaModel(
            id = 5,
            title = "Electrodomésticos",
            image = R.drawable.electro)

        val categoriasList = listOf<CategoriaModel>(
            categoriaUno,
            categoriaDos,
            categoriaTres,
            categoriaCuatro,
            categoriaCinco
        )
        return categoriasList
    }

}