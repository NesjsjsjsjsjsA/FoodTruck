package com.pdmtaller.N00133723AyalaAbarca.UI.Screens

import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Dish

object OrderManager {
    private val ordenes = mutableListOf<Dish>()

    fun agregarPlatillo(dish: Dish) {
        ordenes.add(dish)
    }
    fun obtenerOrdenes(): List<Dish> = ordenes

    fun limpiarOrdenes() {
        ordenes.clear()
    }
}
