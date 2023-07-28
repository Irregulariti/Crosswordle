package com.irregulariti.crosswordle.ui.screens.levels

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp

@Composable
fun Levels() {

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        repeat(20) {
            Text("Item $it", modifier = Modifier.padding(20.dp))
        }
    }
}