package com.irregulariti.crosswordle.ui.bottomnavigation.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val icon: ImageVector,
    val route: String,
    val label: String,
)