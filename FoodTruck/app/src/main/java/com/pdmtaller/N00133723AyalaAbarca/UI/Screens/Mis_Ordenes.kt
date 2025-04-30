package com.pdmtaller.N00133723AyalaAbarca.UI.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pdmtaller.N00133723AyalaAbarca.UI.Components.DishPresentation
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrdenesScreen(navController: NavHostController) {
    val ordenes = OrderManager.obtenerOrdenes()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Mis órdenes") }) },
        bottomBar = { PersonalBottomBar(navController) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            if (ordenes.isEmpty()) {
                Text("No has agregado ningún platillo.")
            } else {
                Button(
                    onClick = { OrderManager.limpiarOrdenes() },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                ) {
                    Text("Vaciar orden")
                }

                LazyColumn {
                    items(ordenes.size) { index ->
                        DishPresentation(ordenes[index])
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                }
            }
        }
    }
}
