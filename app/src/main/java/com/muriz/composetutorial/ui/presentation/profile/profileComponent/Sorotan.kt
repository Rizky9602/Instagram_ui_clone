package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Sorotan(modifier: Modifier = Modifier) {
    Row (horizontalArrangement = Arrangement.Start, modifier = modifier.fillMaxWidth().padding(5.dp)){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage(
                model = "https://i.pinimg.com/736x/51/2b/03/512b03e8728f90be4fcfb89cf0ac0046.jpg",
                contentDescription = "Sorotan profil",
                contentScale = ContentScale.Crop,
                modifier = modifier.clip(CircleShape)
            )
            Text(text = "Sorotan")
        }
        Spacer(modifier = modifier.width(7.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "add icon",
                modifier.border(
                    width = 2.dp,
                    brush = Brush.linearGradient(colors = listOf(Color.White)),
                    shape = CircleShape
                )
            )
            Text(text = "Baru")
        }
    }
}

@Preview()
@Composable
private fun sorotan() {
    Sorotan()
}