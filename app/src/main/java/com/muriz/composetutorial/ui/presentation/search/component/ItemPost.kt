package com.muriz.composetutorial.ui.presentation.search.component

import android.content.Context
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.ImageLoader
import coil.compose.AsyncImage

@Composable
fun ItemPost(
    modifier: Modifier = Modifier,
    imageUrl: String,
    context: Context = LocalContext.current
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        imageLoader = ImageLoader(context),
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}