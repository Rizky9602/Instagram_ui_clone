package com.muriz.composetutorial.ui.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.ButtonProfile
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.ContentNavigation
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.DetailProfile
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.NameDesc
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.Sorotan
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.TopBarProfile

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(start = 5.dp, end = 5.dp)){
        TopBarProfile()
        Spacer(modifier = modifier.height(45.dp))
        DetailProfile()
        NameDesc()
        ButtonProfile()
        Sorotan()
        Spacer(modifier = Modifier.size(5.dp))
        ContentNavigation()
    }
}
