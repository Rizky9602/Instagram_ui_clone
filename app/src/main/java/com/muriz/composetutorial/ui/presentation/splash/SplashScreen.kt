package com.muriz.composetutorial.ui.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.muriz.composetutorial.R
import com.muriz.composetutorial.ui.presentation.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    SplashContent(navController = navController)
}

@Composable
fun SplashContent(modifier: Modifier = Modifier, navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(1000)
        navController.navigate(Screen.Home.router) {
            popUpTo(Screen.Splash.router) {
                inclusive = true
            }
        }
    }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.app_icon),
            contentDescription = "icon App",
            modifier.size(100.dp)
        )
        Column(
            modifier = modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "from", fontWeight = FontWeight.Light)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.padding(bottom = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_meta),
                    contentDescription = "meta Icon",
                    modifier = modifier
                        .size(25.dp)
                )
                Text(
                    text = "Meta",
                    style = TextStyle(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF833AB4),
                                Color(0xFFF77737),
                                Color(0xFFE1306C),
                                Color(0xFFC13584)
                            )
                        ),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = modifier.padding(start = 5.dp)
                )
            }
        }
    }
}