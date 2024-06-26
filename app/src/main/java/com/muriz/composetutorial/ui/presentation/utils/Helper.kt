package com.muriz.composetutorial.ui.presentation.utils

import com.muriz.composetutorial.ui.presentation.navigation.Screen

fun String?.ShowBottomBar(): Boolean {
    return this in setOf(
        Screen.Home.router,
        Screen.Search.router,
        Screen.AddPosting.router,
        Screen.Reels.router,
        Screen.Profile.router
    )
}