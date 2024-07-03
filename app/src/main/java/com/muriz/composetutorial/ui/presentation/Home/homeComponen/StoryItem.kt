package com.muriz.composetutorial.ui.presentation.Home.homeComponen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
fun StoryItem(
    username: String,
    imageUrl: Any,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        AsyncImage(
            model = imageUrl,
            contentScale = ContentScale.Crop,
            contentDescription = "$username profile",
            modifier = Modifier
                .border(
                    4.dp,
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFd71069),
                            Color(0xFFe25d6a),
                            Color(0xFFe9ad55)
                        )
                    ),
                    CircleShape
                ).padding(7.dp)
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(text = username)
    }
}

@Preview(showBackground = true)
@Composable
private fun StoryItem() {
    StoryItem(
        username = "username",
        imageUrl = "https://i.pinimg.com/736x/8f/c6/98/8fc6985b7749b5e1c4f6133ce7f2d07a.jpg"
    )
}