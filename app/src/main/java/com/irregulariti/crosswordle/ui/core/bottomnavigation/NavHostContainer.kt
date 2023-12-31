package com.irregulariti.crosswordle.ui.core.bottomnavigation


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.irregulariti.crosswordle.ui.screens.createCW.Creator
import com.irregulariti.crosswordle.ui.screens.glossary.Glossary
import com.irregulariti.crosswordle.ui.screens.levels.Levels
import com.irregulariti.crosswordle.ui.screens.profile.Profile

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,

        startDestination = "levels",


        modifier = Modifier.padding(paddingValues = padding),

        builder = {


            composable("gloss") {
                Glossary()
            }


            composable("levels") {
                Levels()
            }


            composable("creator") {
                Creator()
            }

            composable("profile") {
                Profile()
            }
        })

}