package com.irregulariti.crosswordle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.irregulariti.crosswordle.screenparams.TransparentSystemBars
import com.irregulariti.crosswordle.ui.core.CreateCore


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            TransparentSystemBars()
            CreateCore()
        }
    }
}



