package com.muriz.composetutorial.ui.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.ButtonProfile
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.DetailProfile
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.NameDesc
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.Sorotan
import com.muriz.composetutorial.ui.presentation.profile.profileComponent.TopBarProfile

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column{
        TopBarProfile()
        DetailProfile()
        NameDesc()
        ButtonProfile()
        Sorotan()
    }
}

@Preview(showSystemUi = true  )
@Composable
private fun test() {
    ProfileScreen()
}