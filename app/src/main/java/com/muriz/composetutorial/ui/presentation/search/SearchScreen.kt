package com.muriz.composetutorial.ui.presentation.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muriz.composetutorial.ui.presentation.data.local.DummyData
import com.muriz.composetutorial.ui.presentation.domain.model.Content
import com.muriz.composetutorial.ui.presentation.search.component.ItemPost
import com.muriz.composetutorial.ui.presentation.search.component.SearchBar

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    val searchPost = DummyData.SearchContent
    SearchContent(searchPost = searchPost)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchContent(searchPost: List<Content>, modifier: Modifier = Modifier) {
    var query by remember { mutableStateOf(("")) }
    Scaffold(modifier = modifier,
        topBar = {
            SearchBar(query = query, onValueChange = { newQuery -> query = newQuery })
        }) { paddingValues ->
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(3),
            verticalItemSpacing = 4.dp,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

            items(searchPost) { post -> ItemPost(imageUrl = post.contents) }
        }
    }
}

@Preview
@Composable
private fun Test() {

}