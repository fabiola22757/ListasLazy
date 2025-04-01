package com.example.listaslazy.Actividad.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.listaslazy.Actividad.ViewModels.CategoriaViewModel

@Composable

fun ListCategoriasView(navController: NavController){
    val categoriaViewModel: CategoriaViewModel = CategoriaViewModel()

    Row (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray))
    {
        LazyRow {
            items(categoriaViewModel.obtenerCategorias()){categoria ->
                CategoriaView(categoria = categoria, navController = navController)
            }
        }
    }
}