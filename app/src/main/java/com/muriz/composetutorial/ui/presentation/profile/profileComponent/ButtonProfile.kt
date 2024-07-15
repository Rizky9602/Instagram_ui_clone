package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.outlined.PersonAdd
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonProfile(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(7.dp),
            modifier = modifier.size(width = 170.dp, height = 35.dp),
            colors = ButtonDefaults.buttonColors(Color.LightGray)
        ) {
            Text(
                text = "Edit Profil",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                color = Color.Black
            )
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(7.dp),
            modifier = modifier.size(width = 170.dp, height = 35.dp),
            colors = ButtonDefaults.buttonColors(Color.LightGray)
        ) {
            Text(
                text = "Bagikan Profil",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                color = Color.Black
            )
        }
        Box(
            modifier = modifier
                .size(40.dp)
                .background(color = Color.LightGray, RoundedCornerShape(7.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Outlined.PersonAdd,
                contentDescription = "person add",
                modifier = modifier
                    .size(30.dp)
            )
        }

    }
}

