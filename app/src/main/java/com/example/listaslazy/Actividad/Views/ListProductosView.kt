package com.example.listaslazy.Actividad.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.listaslazy.Actividad.Models.ProductoModel
import com.example.listaslazy.Actividad.ViewModels.ProductosViewModel

@Composable

fun ListProductosView(categoriaId: Int, navController: NavController){
    val productosViewModel: ProductosViewModel = ProductosViewModel()
    val productos = productosViewModel.obtenerProductosPorCategoria(categoriaId)

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(productos){
            product -> CardView(product)
        }
    }
}

@Composable
fun CardView(producto: ProductoModel){
    Card(
        modifier = Modifier
            .height(300.dp)
            .width(600.dp)
            .padding(vertical = 10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(painter = painterResource(id = producto.image),
                    contentDescription = producto.nombre_prod,
                    modifier = Modifier.size(120.dp).padding(8.dp),
                    contentScale = ContentScale.Crop)

                Column (modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.Start){
                    Text(text = producto.nombre_prod,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Row {
                        Text(text = "$ ${producto.precio}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Blue)
                        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                        Text(text = "-% ${producto.descuento}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = producto.envio,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black)
                }
            }
        }
    }
}