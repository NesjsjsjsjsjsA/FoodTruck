package com.pdmtaller.N00133723AyalaAbarca

import AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.pdmtaller.N00133723AyalaAbarca.UI.ui.FoodSpot_By_NestorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpot_By_NestorTheme {
                    val navController = rememberNavController()
                AppNavigation(navController)
                }
            }
        }
    }

