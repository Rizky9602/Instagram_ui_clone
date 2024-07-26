package com.muriz.composetutorial.ui.presentation.profile.profileComponent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Apps
import androidx.compose.material.icons.outlined.VideoLibrary
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ContentNavigation(
    modifier: Modifier = Modifier

) {
    val tabItems = listOf(
        TabItem(
            title = "post",
            unSelectedIcon = Icons.Outlined.Apps,
            selectedIcon = Icons.Filled.Apps
        ),
        TabItem(
            title = "Reels",
            unSelectedIcon = Icons.Outlined.VideoLibrary,
            selectedIcon = Icons.Filled.VideoLibrary
        ),
        TabItem(
            title = "mention",
            unSelectedIcon = Icons.Outlined.AccountBox,
            selectedIcon = Icons.Filled.AccountBox
        )
    )
    val pagerState = rememberPagerState {
        tabItems.size
    }
    var selectedIndexItem by remember {
        mutableIntStateOf(0)
    }
    LaunchedEffect(selectedIndexItem) {
            pagerState.animateScrollToPage(selectedIndexItem)
    }
    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
        if(!pagerState.isScrollInProgress) {
            selectedIndexItem = pagerState.currentPage
        }
    }
    Column(modifier = modifier.fillMaxSize()) {
        TabRow(selectedTabIndex = selectedIndexItem) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    selected = index == selectedIndexItem,
                    onClick = {
                        selectedIndexItem = index
                    },
                    icon = {
                        Icon(
                            imageVector = if (selectedIndexItem == index) {
                                item.selectedIcon
                            } else item.unSelectedIcon, contentDescription = "icon ${item.title}"
                        )
                    }
                )
            }
        }
        HorizontalPager(
            state = pagerState, modifier = modifier
                .fillMaxWidth()
                .weight(1f)
        ) { index ->
            Box(modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.TopStart
            ){
                
            }
        }
    }
}


data class TabItem(
    val title: String,
    val unSelectedIcon: ImageVector,
    val selectedIcon: ImageVector
)


@Preview
@Composable
private fun Test() {
    ContentNavigation()
}
