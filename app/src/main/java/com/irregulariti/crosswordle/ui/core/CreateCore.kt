package com.irregulariti.crosswordle.ui.core

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.irregulariti.crosswordle.ui.core.bottomnavigation.BottomNavigationBar
import com.irregulariti.crosswordle.ui.core.bottomnavigation.NavHostContainer
import com.irregulariti.crosswordle.ui.core.topbar.MainTopAppBar

@Composable
fun CreateCore() {
    val navController = rememberNavController()

    Surface(color = Color.White) {

        Scaffold(
            topBar = { MainTopAppBar(navController = navController) },

            bottomBar = { BottomNavigationBar(navController = navController) },

            content = { padding ->
                NavHostContainer(navController = navController, padding = PaddingValues(5.dp))
            }
        )
    }
}