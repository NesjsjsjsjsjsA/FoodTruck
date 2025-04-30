// AppNavigation.kt
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller.N00133723AyalaAbarca.UI.Screens.Busquedas
import com.pdmtaller.N00133723AyalaAbarca.UI.Screens.MainMenu

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            MainMenu(navController)
        }
        composable("busqueda/{nombre}") { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Busquedas(nombre)
        }
    }
}
