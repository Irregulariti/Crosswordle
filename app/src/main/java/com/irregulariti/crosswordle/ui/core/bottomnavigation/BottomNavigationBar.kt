package com.irregulariti.crosswordle.ui.core.bottomnavigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.irregulariti.crosswordle.ui.core.bottomnavigation.utils.Constants
import com.irregulariti.crosswordle.ui.core.bottomnavigation.utils.getVectors
import com.irregulariti.crosswordle.ui.theme.SelectedIconColor
import com.irregulariti.crosswordle.ui.theme.UnselectedIconColor


@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val bottomBarState = rememberSaveable { (mutableStateOf(true)) }

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    bottomBarState.value = currentRoute != "profile"

    AnimatedVisibility(
        visible = bottomBarState.value,
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it }),
        content = {
            BottomNavigation(
                Modifier.safeContentPadding(),

                backgroundColor = Color.White
            ) {


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

                        Modifier.padding(top = 8.dp, bottom = 8.dp),

                        selectedContentColor = SelectedIconColor,

                        unselectedContentColor = UnselectedIconColor

                    )
                }
            }
        }
    )
}