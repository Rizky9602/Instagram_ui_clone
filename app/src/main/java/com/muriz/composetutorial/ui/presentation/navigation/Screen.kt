package com.muriz.composetutorial.ui.presentation.navigation

sealed class Screen(val router : String){
    data object Home : Screen("Home_Screen")
    data object Search : Screen("Search_Screen")
    data object AddPosting : Screen("Add_Posting_Screen")
    data object Reels : Screen("Reels_Screen")
    data object Profile : Screen("Profile_Screen")
    data object Splash : Screen("Splash_Screen")
}