package com.pdmtaller.N00133723AyalaAbarca.Data.Model

data class Restaurant(
    val id: Int,
    val name: String,
    val descripcion: String,
    val imagenUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)
