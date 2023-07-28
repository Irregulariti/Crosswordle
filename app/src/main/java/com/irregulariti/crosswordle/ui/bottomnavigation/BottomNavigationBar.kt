package com.irregulariti.crosswordle.ui.bottomnavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.irregulariti.crosswordle.ui.bottomnavigation.utils.Constants
import com.irregulariti.crosswordle.ui.bottomnavigation.utils.getVectors
import com.irregulariti.crosswordle.ui.theme.SelectedIconColor
import com.irregulariti.crosswordle.ui.theme.UnselectedIconColor


@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(
        androidx.compose.ui.Modifier.safeContentPadding(),

        backgroundColor = Color.White
    ) {


        val navBackStackEntry by navController.currentBackStackEntryAsState()


        val currentRoute = navBackStackEntry?.destination?.route


        Constants.BottomNavItems.forEach { navItem ->

            BottomNavigationItem(


                selected = currentRoute == navItem.route,

                onClick = {
                    if (currentRoute != navItem.route) {
                        navController.navigate(navItem.route)
                    }
                },

                icon = {
                    Icon(
                        imageVector = getVectors(n = navItem.route),
                        contentDescription = navItem.label,
                    )
                },

                Modifier.padding(top = 8.dp,bottom = 8.dp),

                selectedContentColor = SelectedIconColor,

                unselectedContentColor = UnselectedIconColor

                )
        }
    }
}