package com.irregulariti.crosswordle.ui.bottomnavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.irregulariti.crosswordle.ui.bottomnavigation.utils.Constants
import com.irregulariti.crosswordle.ui.bottomnavigation.utils.getVectors


@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(


        backgroundColor = Color(0xFF2B92C2)
    ) {


        val navBackStackEntry by navController.currentBackStackEntryAsState()


        val currentRoute = navBackStackEntry?.destination?.route


        Constants.BottomNavItems.forEach { navItem ->


            BottomNavigationItem(


                selected = currentRoute == navItem.route,

                onClick = {
                    navController.navigate(navItem.route)
                },


                icon = {
                    Icon(imageVector = getVectors(n = navItem.route), contentDescription = navItem.label)
                },

            )
        }
    }
}