package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatListBulleted
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.AlternateEmail
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBarProfile(modifier: Modifier = Modifier.padding(top = 5.dp)) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Lock,
            contentDescription = "Lock Icon",
            modifier = modifier
                .padding(end = 3.dp)
                .size(20.dp)
        )
        Text(
            text = "muhammd__rizky",
            modifier = modifier.padding(end = 1.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
        Icon(imageVector = Icons.Outlined.ExpandMore, contentDescription = "ExpandMore Icon")
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = modifier.fillMaxWidth()) {
            Icon(
                imageVector = Icons.Outlined.AlternateEmail,
                contentDescription = "AlternateEmail icon",
                modifier = modifier.size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.AddBox, contentDescription = "addbox Icon",
                modifier = modifier.size(30.dp)
            )
            Icon(
                imageVector = Icons.Default.FormatListBulleted, contentDescription = "list icon",
                modifier = modifier.size(30.dp)
            )
        }
    }
}