package com.muriz.composetutorial.ui.presentation.screen.homeComponen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.muriz.composetutorial.R

@Composable
fun FooterPost(like: Int, modifier: Modifier = Modifier) {
    val (checked, setChecked) = remember { mutableStateOf(false) }
    var temp = false
    Column {
        Row(
            modifier = modifier
                .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 0.dp)
                .fillMaxWidth()
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier) {
                IconButton(onClick = { setChecked(!checked) }) {
                    if (checked) {
                        temp = true
                    }
                    Icon(
                        imageVector = if (checked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                        contentDescription = if (checked) "Checked Icon" else "Unchecked Icon",
                        modifier = Modifier.size(35.dp)
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.bubble_chat_black),
                        contentDescription = "comment icon",
                        modifier = Modifier.size(32.dp)
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.paper_plane_share_black),
                        contentDescription = "share icon",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.BookmarkBorder,
                        contentDescription = "Bookmark Icon",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }
        Row(modifier = Modifier.padding(top = 0.dp, start = 15.dp)) {
            var likes = like
            if (temp){
                likes++
            }
            Text(text = "$likes suka", fontWeight = FontWeight.Bold, fontSize = 17.sp)
        }
    }
}