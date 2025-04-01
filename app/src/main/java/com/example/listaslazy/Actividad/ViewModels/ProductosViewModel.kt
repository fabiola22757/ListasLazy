package com.example.listaslazy.Actividad.ViewModels

import androidx.lifecycle.ViewModel
import com.example.listaslazy.Actividad.Models.ProductoModel
import com.example.listaslazy.R

class ProductosViewModel : ViewModel() {

    // Mapa para almacenar productos por categoría (simulado)
    private val productosPorCategoria: Map<Int, List<ProductoModel>> = mapOf(
        1 to listOf( // Supermercado
            ProductoModel(1, R.drawable.supermercado, "$10.99", "Manzanas", "Envío Gratis", "10%"),
            ProductoModel(2, R.drawable.supermercado, "$5.49", "Leche", "Envío en 24h", "5%"),
            ProductoModel(3, R.drawable.supermercado, "$2.79", "Pan", "Envío Gratis", "0%"),
            ProductoModel(4, R.drawable.supermercado, "$8.29", "Huevos", "Envío en 24h", "15%"),
            ProductoModel(5, R.drawable.supermercado, "$3.99", "Yogurt", "Envío Gratis", "0%")
        ),
        2 to listOf( // Tecnología
            ProductoModel(6, R.drawable.tecnologia, "$1299.00", "Laptop", "Envío Gratis", "20%"),
            ProductoModel(7, R.drawable.tecnologia, "$199.00", "Audífonos", "Envío en 24h", "10%"),
            ProductoModel(8, R.drawable.tecnologia, "$799.00", "Tablet", "Envío Gratis", "5%"),
            ProductoModel(9, R.drawable.tecnologia, "$49.00", "Smartwatch", "Envío en 24h", "0%"),
            ProductoModel(10, R.drawable.tecnologia, "$99.00", "Teclado", "Envío Gratis", "15%")
        ),
        3 to listOf( // Vehículos
            ProductoModel(11, R.drawable.vehiculos, "$25000.00", "Coche Eléctrico", "Entrega en Concesionario", "0%"),
            ProductoModel(12, R.drawable.vehiculos, "$150.00", "Casco Moto", "Envío en 48h", "5%"),
            ProductoModel(13, R.drawable.vehiculos, "$20.00", "Aceite Motor", "Envío en 24h", "10%"),
            ProductoModel(14, R.drawable.vehiculos, "$100.00", "Batería Coche", "Envío en 72h", "2%"),
            ProductoModel(15, R.drawable.vehiculos, "$50.00", "Neumáticos", "Entrega en Taller", "0%")
        ),
        4 to listOf( // Mascotas
            ProductoModel(16, R.drawable.mascotas, "$20.00", "Comida Perro", "Envío en 24h", "0%"),
            ProductoModel(17, R.drawable.mascotas, "$35.00", "Rascador Gato", "Envío Gratis", "5%"),
            ProductoModel(18, R.drawable.mascotas, "$15.00", "Juguete Perro", "Envío en 48h", "10%"),
            ProductoModel(19, R.drawable.mascotas, "$12.00", "Collar Gato", "Envío en 24h", "2%"),
            ProductoModel(20, R.drawable.mascotas, "$8.00", "Correa Perro", "Envío Gratis", "0%")
        ),
        5 to listOf( // Electrodomésticos
            ProductoModel(21, R.drawable.electro, "$400.00", "Nevera", "Entrega en 5 días", "15%"),
            ProductoModel(22, R.drawable.electro, "$250.00", "Lavadora", "Entrega en 3 días", "10%"),
            ProductoModel(23, R.drawable.electro, "$100.00", "Microondas", "Entrega en 2 días", "5%"),
            ProductoModel(24, R.drawable.electro, "$50.00", "Aspiradora", "Entrega en 24h", "0%"),
            ProductoModel(25, R.drawable.electro, "$30.00", "Tostadora", "Entrega en 48h", "2%")
        )
    )

    fun obtenerProductosPorCategoria(categoriaId: Int): List<ProductoModel> {
        return productosPorCategoria[categoriaId] ?: emptyList() // Devuelve una lista vacía si no encuentra la categoría
    }
}