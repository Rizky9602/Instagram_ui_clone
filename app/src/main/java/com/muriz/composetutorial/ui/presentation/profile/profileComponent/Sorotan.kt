package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import com.muriz.composetutorial.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Sorotan(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Start, modifier = modifier
            .fillMaxWidth()
            .padding(5.dp)
    )
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage(
                model = "https://i.pinimg.com/736x/41/a9/89/41a9899bfae4142de5f2022e46b386ba.jpg",
                contentDescription = "YEs",
                modifier = modifier
                    .size(70.dp)
                    .clip(
                        CircleShape
                    ).border(1.dp, color = Color.White, shape = CircleShape,),
                contentScale = ContentScale.Crop
            )
            Text(text = "Sorotan", fontSize = 10.sp)
        }
        Spacer(modifier = modifier.width(20.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = modifier
                    .size(70.dp)
                    .border(BorderStroke(0.5.dp, color = Color.Black), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.add_sorotan),
                    contentDescription = "add sorotan",
                    modifier = modifier.size(30.dp)
                )
            }

            Text(text = "Baru", fontSize = 10.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun sorotan() {
    Sorotan()
}