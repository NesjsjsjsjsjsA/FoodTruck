import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller.N00133723AyalaAbarca.UI.Screens.BusquedaScreen
import com.pdmtaller.N00133723AyalaAbarca.UI.Screens.OrdenesScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "listas") {
        composable("listas") {
            Listas(navController)
        }
        composable("busqueda") {
            BusquedaScreen("", navController = navController) // Sin parámetro
        }
        composable("busqueda/{nombre}") { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            BusquedaScreen(nombre,navController = navController)
        }
        composable("Mis_ordenes") {
            OrdenesScreen(navController)
        }

    }

}
