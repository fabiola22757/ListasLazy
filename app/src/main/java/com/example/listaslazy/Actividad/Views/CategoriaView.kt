package com.example.listaslazy.Actividad.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.listaslazy.Actividad.Models.CategoriaModel

@Composable

fun CategoriaView(categoria: CategoriaModel, navController: NavController){

    Card (modifier = Modifier
        .height(300.dp)
        .width(280.dp)
        .padding(10.dp)
        .clickable(){
            navController.navigate("productos/${categoria.id}")
        },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = categoria.title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black)
            Image(painter = painterResource(id = categoria.image),
                contentDescription = "categoria",
                modifier = Modifier.size(250.dp).padding(10.dp),
                contentScale = ContentScale.Crop)
        }
    }
}