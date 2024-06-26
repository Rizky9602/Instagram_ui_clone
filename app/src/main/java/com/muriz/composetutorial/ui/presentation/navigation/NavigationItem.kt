package com.muriz.composetutorial.ui.presentation.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val unselected: ImageVector,
    val selected: ImageVector,
    val screen: Screen
)
