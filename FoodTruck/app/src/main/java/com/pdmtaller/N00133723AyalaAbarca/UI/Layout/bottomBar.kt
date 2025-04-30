package com.pdmtaller.N00133723AyalaAbarca.UI.Layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import kotlinx.coroutines.selects.select


data class NavItem(val label: String, val icon: ImageVector, val route: String) //Declarado

@Composable
fun PersonalBottomBar(navController: NavController)
{
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {

                if (currentRoute!= "listas")
                {
                    navController.navigate("listas"){popUpTo("listas") {inclusive = true}}}
                 },

                enabled = currentRoute != "listas")

            {
                Icon(Icons.Default.List, contentDescription = "lista")
            }

            IconButton(onClick = {

                if(currentRoute!="BusquedasScreen")
                {
                    navController.navigate("BusquedasScreen"){popUpTo("BusquedasScreen") {inclusive = true}}}
            },

                enabled = currentRoute != "BusquedasScreen")

            {
                Icon(Icons.Default.Search, contentDescription = "Búsqueda")
            }
            IconButton(onClick = {

                if (currentRoute!="Mis_ordenes")
                {
                    navController.navigate("Mis_ordenes"){popUpTo("Mis_ordenes"){inclusive = true} }}
            },
                enabled = currentRoute != "Mis_ordenes"

                ) {
                Icon(Icons.Default.ShoppingCart, contentDescription = "Órdenes")
            }
        }
    }
}
