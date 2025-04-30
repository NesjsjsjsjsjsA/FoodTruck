import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Listas(navController: NavHostController) {
    val name = "Rico"
    val name2 = "Sabroso"

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Los corridos de Gustavo Lerma") }
            )
        },
        bottomBar = { PersonalBottomBar(navController) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Comida $name")
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Button(onClick = {
                        navController.navigate("busqueda/Los taquillos de camelo")
                    }) {
                        Text("Los taquillos \nde camelo", textAlign = TextAlign.Center)
                    }
                    Button(onClick = {
                        navController.navigate("busqueda/Donas luis")
                    }) {
                        Text("Donas \nluis", textAlign = TextAlign.Center)
                    }
                }
                Text(text = "Comida $name2")
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Button(onClick = {
                        navController.navigate("busqueda/Los barbaros")
                    }) {
                        Text("Los \nbarbaros", textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}
