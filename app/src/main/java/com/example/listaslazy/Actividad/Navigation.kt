package com.example.listaslazy.Actividad

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.listaslazy.Actividad.Views.ListCategoriasView
import com.example.listaslazy.Actividad.Views.ListProductosView

@Composable

fun Navigation(navController: NavHostController){

    val navController = rememberNavController() // Crea un NavHostController

    NavHost(
        navController = navController,
        startDestination = "categorias"
    ) {
        composable("categorias") {
            ListCategoriasView(navController)
        }

        composable(
            "productos/{categoriaId}",
            arguments = listOf(navArgument("categoriaId"){type = NavType.IntType})
        ){ backStackEntry ->
            val categoriaId = backStackEntry.arguments?.getInt("categoriaId") ?: 0
            ListProductosView(categoriaId, navController)
        }
    }
}