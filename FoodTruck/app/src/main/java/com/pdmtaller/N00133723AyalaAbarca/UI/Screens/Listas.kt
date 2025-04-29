package com.pdmtaller.N00133723AyalaAbarca.UI.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller.N00133723AyalaAbarca.UI.Layout.PersonalBottomBar
import kotlinx.coroutines.selects.select

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenu() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Los corridos de Gustavo Lerma") }
            )
        },
                bottomBar = {PersonalBottomBar()}
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

                Text(text = "Comida de ...")

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = {  }) {
                        Text("Botón 1")
                    }
                    Button(onClick = {  }) {
                        Text("Botón 2")
                    }
                    Button(onClick = { }) {
                        Text("Botón 3")
                    }
                }

                Text(text = "Comida de ...")

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = {  }) {
                        Text("Botón 1")
                    }
                    Button(onClick = {  }) {
                        Text("Botón 2")
                    }
                    Button(onClick = {  }) {
                        Text("Botón 3")
                    }
                }

            }
        }
    }
}


@Preview (showBackground = true)
@Composable
fun see ()
{
    MainMenu()
}
