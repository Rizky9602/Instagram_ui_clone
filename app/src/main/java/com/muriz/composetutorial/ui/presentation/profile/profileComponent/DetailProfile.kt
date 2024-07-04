package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.muriz.composetutorial.R

@Composable
fun DetailProfile(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        AsyncImage(
            model = R.drawable.me,
            contentDescription = "image profile",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .clip(CircleShape)
                .size(70.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "1")
            Text(text = "Postingan")
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "225")
            Text(text = "pengikut")
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "218")
            Text(text = "mengikuti")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun test() {
    DetailProfile()
}