package com.irregulariti.crosswordle.ui.bottomnavigation.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import com.irregulariti.crosswordle.ui.bottomnavigation.models.BottomNavItem

object Constants {
    val BottomNavItems = listOf(
        BottomNavItem(
            icon =  Icons.Default.Info,
            route = "gloss",
            label = "glossary"
        ),
        BottomNavItem(
            icon = Icons.Default.Info,
            route = "levels",
            label = "levels"
        ),
        BottomNavItem(
            icon = Icons.Default.Info,
            route = "creator",
            label = "creator"
        )
    )
}