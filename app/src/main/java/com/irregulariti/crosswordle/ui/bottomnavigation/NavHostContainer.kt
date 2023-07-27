package com.irregulariti.crosswordle.ui.bottomnavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.irregulariti.crosswordle.ui.createCW.Creator
import com.irregulariti.crosswordle.ui.glossary.Glossary
import com.irregulariti.crosswordle.ui.levels.Levels

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,

        // set the start destination as home
        startDestination = "levels",

        // Set the padding provided by scaffold
        modifier = Modifier.padding(paddingValues = padding),

        builder = {

            // route : Home
            composable("gloss") {
                Glossary()
            }

            // route : search
            composable("levels") {
                Levels()
            }

            // route : profile
            composable("creator") {
                Creator()
            }
        })

}