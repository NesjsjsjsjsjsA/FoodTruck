import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenu(navController: NavHostController)
{
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Welcome To FOOTRUCK delicious") }
            )
        },
        bottomBar = { PersonalBottomBar(navController) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {}
    }
}
