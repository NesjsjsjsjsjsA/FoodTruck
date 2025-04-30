package com.pdmtaller.N00133723AyalaAbarca.Data.Dummy

import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Dish
import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Restaurant

val restaurant = listOf(Restaurant
    (
            id = 1,
            name = "Los taquillos de camelo",
            descripcion = "Hambre + restaurante = satisfecho",
            imagenUrl = "https",
            categories = listOf("Tacos","chatarra","golosos","Numes","Layos"),
            menu = listOf(Dish(
                id = 1,
                name = "La famosa roca bola",
                description = "Te detonara",
                imagenURL = "Https"
            ))
            ))