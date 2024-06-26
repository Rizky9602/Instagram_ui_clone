package com.muriz.composetutorial.ui.presentation.screen.homeComponen

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage

@Composable
fun PostItem(
    username: String,
    imagePost: String,
    imageProfile: String,
    desc: String,
    like: Int,
    context: Context = LocalContext.current
) {
    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append("$username ")
        }
        append(desc)
    }
    Column(modifier = Modifier.fillMaxWidth()) {
        HeaderPost(
            username = username,
            imageProfile = imageProfile,
        )
        AsyncImage(
            model = imagePost,
            contentDescription = "image post",
            imageLoader = ImageLoader(context),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        FooterPost(like = like)
        Text(text = annotatedString, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 17.dp , end = 17.dp, bottom = 10.dp))
    }
}
