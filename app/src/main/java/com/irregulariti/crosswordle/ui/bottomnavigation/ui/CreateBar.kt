package com.irregulariti.crosswordle.ui.bottomnavigation.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.irregulariti.crosswordle.ui.bottomnavigation.BottomNavigationBar
import com.irregulariti.crosswordle.ui.bottomnavigation.NavHostContainer

@Composable
fun CreateBar() {

    val navController = rememberNavController()
    Surface(color = Color.White) {

        Scaffold(

            bottomBar = {
                BottomNavigationBar(navController = navController)
            }, content = { padding ->

                NavHostContainer(navController = navController, padding = padding)
            }
        )
    }
}