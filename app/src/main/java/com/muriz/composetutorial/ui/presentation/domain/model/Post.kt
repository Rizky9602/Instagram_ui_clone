package com.muriz.composetutorial.ui.presentation.domain.model

data class Post(
    val id : Int,
    val username : String,
    val imageUrl : String,
    val imagepost : String,
    val like : Int,
    val desc : String,
    val date : String
)

