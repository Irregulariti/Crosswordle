package com.irregulariti.crosswordle.ui.screens.levels

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.irregulariti.crosswordle.R
import com.irregulariti.crosswordle.Size

@Composable
fun Levels() {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .paint(painterResource(id = R.drawable.background_version1), contentScale = ContentScale.FillBounds)
        ) {
            items(20) { it ->
                Text("Item $it", modifier = Modifier.padding(20.dp))
            }
        }

}