package com.pdmtaller.N00133723AyalaAbarca.UI.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pdmtaller.N00133723AyalaAbarca.Data.Dummy.restaurant
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar
import com.pdmtaller.N00133723AyalaAbarca.UI.Components.DishPresentation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusquedaScreen(restaurantName: String = "", navController: NavHostController) {
    var searchText by remember { mutableStateOf("") }
    var categoriaSeleccionada by remember { mutableStateOf("") }
    val restaurantFiltrado = restaurant.find { it.name == restaurantName }

    val categorias = restaurantFiltrado?.categories ?: emptyList()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Hora de comer en: $restaurantName") })
        },
        bottomBar = { PersonalBottomBar(navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Haz una búsqueda!") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            Text(text = "Te tenemos solo lo mejor amigo :D")

            val menuFiltrado = restaurantFiltrado?.menu?.filter {
                it.name.contains(searchText, ignoreCase = true) &&
                        (categoriaSeleccionada.isEmpty() || restaurantFiltrado.categories.contains(categoriaSeleccionada))
            } ?: emptyList()

            LazyColumn {
                items(menuFiltrado.size) { index ->
                    val dish = menuFiltrado[index]
                    var agregado by remember { mutableStateOf(false) }

                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)) {
                        DishPresentation(dish)
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = {
                                OrderManager.agregarPlatillo(dish)
                                agregado = true
                            },
                            enabled = !agregado
                        ) {
                            Text(if (agregado) "Agregado" else "Agregar a orden")
                        }
                    }
                }
            }
        }
    }
}
