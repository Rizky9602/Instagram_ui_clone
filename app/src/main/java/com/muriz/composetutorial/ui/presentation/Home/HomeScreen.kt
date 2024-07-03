package com.muriz.composetutorial.ui.presentation.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muriz.composetutorial.R
import com.muriz.composetutorial.ui.presentation.data.local.DummyData
import com.muriz.composetutorial.ui.presentation.domain.model.Post
import com.muriz.composetutorial.ui.presentation.domain.model.User
import com.muriz.composetutorial.ui.presentation.Home.homeComponen.PostItem
import com.muriz.composetutorial.ui.presentation.Home.homeComponen.StoryItem

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    HomeContent(
        modifier = modifier,
        users = DummyData.users,
        post = DummyData.posts
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    users: List<User>,
    post: List<Post>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.padding(top = 0.dp)
    ) { paddingValues ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = modifier.padding(paddingValues)
        ) {
            item {
                TopAppBar(
                    title = {
                        Text(
                            "Instagram",
                            fontFamily = lobster,
                            fontSize = 35.sp
                        )
                    },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorit icon button",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.chat_top_bar),
                                contentDescription = "chat icon",
                                modifier = Modifier.size(27.dp)
                            )
                        }
                    }
                )
            }
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier.padding(top = 0.dp, bottom = 0.dp)
                ) {
                    items(users) { users ->
                        StoryItem(username = users.userName, imageUrl = users.imageUrl)
                    }
                }
            }
            items(post) { post ->
                PostItem(
                    username = post.username,
                    imagePost = post.imagepost,
                    imageProfile = post.imageUrl,
                    desc = post.desc,
                    like = post.like
                )
            }
        }
    }
}

val lobster = FontFamily(
    Font(R.font.lobster_regular, FontWeight.Bold),
)

@Preview
@Composable
private fun HomeContentPreview() {
    HomeContent(DummyData.users, DummyData.posts)
}


