package com.pdmtaller.N00133723AyalaAbarca.UI.Screens

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller.N00133723AyalaAbarca.Data.Dummy.restaurant
import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Dish
import com.pdmtaller.N00133723AyalaAbarca.Data.Model.Restaurant
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Busquedas(restaurantName : String) {

    var lista by remember { mutableStateOf("") }

    val Restaurant = restaurant

    val name = restaurantName

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Hora de comer!!!") }
            )
        },
        bottomBar = { PersonalBottomBar()}
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Buscador
            TextField(
                value = lista,
                onValueChange = {
                    val it = null
                    lista = it.toString()
                },
                label = { Text("Buscar...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
        }
    }
}

