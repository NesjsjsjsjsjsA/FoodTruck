import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller.N00133723AyalaAbarca.Data.Dummy.restaurant
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusquedaScreen(restaurantName: String) {
    var searchText by remember { mutableStateOf("") }

    val restaurantFiltrado = restaurant.find { it.name == restaurantName }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Hora de comer en: $restaurantName") })
        },
        bottomBar = { PersonalBottomBar() }
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
                label = { Text("Buscar en el menú...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            if (restaurantFiltrado != null) {
                LazyColumn {
                    val menuFiltrado = restaurantFiltrado.menu.filter {
                        it.name.contains(searchText, ignoreCase = true)
                    }
                    items(menuFiltrado.size) { index ->
                        val dish = menuFiltrado[index]
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = dish.name)
                                Text(text = dish.description)
                            }
                        }
                    }
                }
            } else {
                Text("Restaurante no encontrado.")
            }
        }
    }
}
