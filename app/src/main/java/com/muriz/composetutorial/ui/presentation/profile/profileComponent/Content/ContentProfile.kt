package com.muriz.composetutorial.ui.presentation.profile.profileComponent.Content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

class ContentProfile {
    @Composable
    fun Post(modifier: Modifier = Modifier) {
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top) {
            AsyncImage(
                model = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg",
                contentDescription = "image post 1",
                modifier
                    .size(130.dp)
                    .clip(shape = RectangleShape), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.size(5.dp))
            AsyncImage(
                model = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg",
                contentDescription = "image post 1",
                modifier
                    .size(130.dp)
                    .clip(shape = RectangleShape), contentScale = ContentScale.Crop
            )
        }
    }

    @Composable
    fun Reels(modifier: Modifier = Modifier) {

    }

    @Composable
    fun Tagging(modifier: Modifier = Modifier) {

    }

    @Preview
    @Composable
    private fun test() {
        Post()

    }
}