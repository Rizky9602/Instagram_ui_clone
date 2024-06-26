package com.muriz.composetutorial.ui.presentation.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.muriz.composetutorial.ui.presentation.data.local.DummyData
import com.muriz.composetutorial.ui.presentation.navigation.NavigationItem
import com.muriz.composetutorial.ui.presentation.utils.ShowBottomBar

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    val navBackStack by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
    val navigationItem = DummyData.BottomBarItems
    val isDarkTheme = isSystemInDarkTheme()

    AnimatedVisibility(visible = currentRoute.ShowBottomBar()) {
        NavigationBar(modifier = Modifier) {
            navigationItem.map { item ->
                NavigationBarItem(
                    selected = currentRoute == item.screen.router,
                    onClick = {
                        navHostController.navigate(item.screen.router) {
                            popUpTo(navHostController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            imageVector = if (currentRoute == item.screen.router) item.selected else item.unselected,
                            contentDescription = "${item.title} icon",
                            modifier = modifier
                                .size(30.dp)
                        )
                    })
            }
        }
    }
}