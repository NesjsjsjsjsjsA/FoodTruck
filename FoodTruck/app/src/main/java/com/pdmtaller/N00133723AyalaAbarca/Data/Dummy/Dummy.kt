package com.pdmtaller.N00133723AyalaAbarca.Data.Dummy

import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Dish
import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Restaurant

val restaurant = listOf(
    Restaurant(
        id = 1,
        name = "Los taquillos de camelo",
        descripcion = "Hambre + restaurante = satisfecho",
        imagenUrl = "",
        categories = listOf("Tacos", "Chatarra", "Golosos"),
        menu = listOf(
            Dish(1, "La famosa roca bola", "Te detonará", "https://img.com/1.jpg"),
            Dish(2, "Taco explosivo", "Con chile y doble tortilla", "https://img.com/2.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Donas Luis",
        descripcion = "Postres azucarados al instante",
        imagenUrl = "",
        categories = listOf("Dulces", "Panadería"),
        menu = listOf(
            Dish(3, "Dona rellena", "Rellena de chocolate oscuro", "https://img.com/3.jpg"),
            Dish(4, "Dona de fresa", "Con glaseado rosa", "https://img.com/4.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Los Bárbaros",
        descripcion = "Carnes al fuego estilo medieval",
        imagenUrl = "",
        categories = listOf("Parrilla", "Carnes"),
        menu = listOf(
            Dish(5, "Costilla brutal", "Costilla BBQ gigante", "https://img.com/5.jpg"),
            Dish(6, "Espada vikinga", "Brocheta con 3 carnes", "https://img.com/6.jpg")
        )
    ),
    Restaurant(
        id = 4,
        name = "Pizzabros",
        descripcion = "La pizza más crujiente del barrio",
        imagenUrl = "",
        categories = listOf("Pizza", "Italiana"),
        menu = listOf(
            Dish(7, "Pizza de 4 quesos", "Con masa artesanal", "https://img.com/7.jpg"),
            Dish(8, "Pizza campeona", "Pepperoni, salami, champiñón", "https://img.com/8.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Sushi Express",
        descripcion = "Sushi para llevar al instante",
        imagenUrl = "",
        categories = listOf("Sushi", "Japonés"),
        menu = listOf(
            Dish(9, "Roll dragón", "Aguacate, camarón y queso crema", "https://img.com/9.jpg"),
            Dish(10, "Nigiri de salmón", "Salmón fresco sobre arroz", "https://img.com/10.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "La Vegana",
        descripcion = "Comida saludable, sabrosa y sin carne",
        imagenUrl = "",
        categories = listOf("Vegana", "Orgánica"),
        menu = listOf(
            Dish(11, "Hamburguesa de lentejas", "Pan integral, lechuga, tomate", "https://img.com/11.jpg"),
            Dish(12, "Ensalada detox", "Kale, quinoa, aguacate", "https://img.com/12.jpg")
        )
    )
)
