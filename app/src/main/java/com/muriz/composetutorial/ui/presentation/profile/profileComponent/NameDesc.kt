package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NameDesc(modifier: Modifier = Modifier) {
    Column (modifier = modifier.padding(5.dp).fillMaxWidth()){
        Text(text = "ikyyyyy")
        Text(text = "9/3")
    }
}