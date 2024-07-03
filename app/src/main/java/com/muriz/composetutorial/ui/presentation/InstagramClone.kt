package com.muriz.composetutorial.ui.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.muriz.composetutorial.ui.presentation.component.BottomBar
import com.muriz.composetutorial.ui.presentation.navigation.Screen
import com.muriz.composetutorial.ui.presentation.Home.HomeScreen
import com.muriz.composetutorial.ui.presentation.search.SearchScreen
import com.muriz.composetutorial.ui.presentation.splash.SplashScreen

@Composable
fun InstagramClone(
    modifier: Modifier = Modifier,
    navBarHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = { BottomBar(navHostController = navBarHostController) }
    ) { paddingValues ->
        NavHost(
            navController = navBarHostController,
            startDestination = Screen.Splash.router,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.router){
                HomeScreen()
            }
            composable(Screen.Search.router){
                SearchScreen()
            }
            composable(Screen.AddPosting.router){

            }
            composable(Screen.Reels.router){

            }
            composable(Screen.Profile.router){

            }
            composable(Screen.Splash.router){
                SplashScreen(navController = navBarHostController)
            }
        }

    }
}