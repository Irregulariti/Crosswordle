package com.irregulariti.crosswordle.ui.bottomnavigation.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.irregulariti.crosswordle.R

@Composable
fun getVectors(n: String): ImageVector{
    return when(n){
        "levels" -> ImageVector.vectorResource(id = R.drawable.playv)
        "creator" -> ImageVector.vectorResource(id = R.drawable.creatorv)
        "gloss" -> ImageVector.vectorResource(id = R.drawable.glossv)
        else -> Icons.Default.Info
    }
}