package com.muriz.composetutorial.ui.presentation.navigation

sealed class Content(val router : String){
    data object Post : Content("Post_Content")
    data object Reels : Content("Reels_Content")
    data object Tagging : Content("Tagging_Content")
}