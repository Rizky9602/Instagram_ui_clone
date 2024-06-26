package com.muriz.composetutorial.ui.presentation.data.local

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.VideoLibrary
import com.muriz.composetutorial.R
import com.muriz.composetutorial.ui.presentation.domain.model.Content
import com.muriz.composetutorial.ui.presentation.domain.model.Post
import com.muriz.composetutorial.ui.presentation.domain.model.User
import com.muriz.composetutorial.ui.presentation.navigation.NavigationItem
import com.muriz.composetutorial.ui.presentation.navigation.Screen

object DummyData {
    val users = listOf(
        User(
            id = 1,
            imageUrl = R.drawable.me,
            userName = "Anda"
        ),
        User(
            id = 2,
            imageUrl = "https://i.pinimg.com/736x/41/a9/89/41a9899bfae4142de5f2022e46b386ba.jpg",
            userName = "jkt48.marsha"
        ),
        User(
            id = 3,
            imageUrl = "https://i.pinimg.com/736x/51/2b/03/512b03e8728f90be4fcfb89cf0ac0046.jpg",
            userName = "jkt48.freya"
        ),
        User(
            id = 4,
            imageUrl = "https://i.pinimg.com/736x/fe/5e/2b/fe5e2bb587662d91817a10ec6d9d31a3.jpg",
            userName = "jkt48gita"
        ),
        User(
            id = 5,
            imageUrl = "https://i.pinimg.com/564x/a4/24/9b/a4249b8c52c6783d2d72dd4fb3835fb1.jpg",
            userName = "jkt48.indira"
        ),
        User(
            id = 6,
            imageUrl = "https://i.pinimg.com/736x/12/df/58/12df581b2fcdc6efb50e9bdcf847dbac.jpg",
            userName = "jkt48.michie_"
        ),
        User(
            id = 7,
            imageUrl = "https://i.pinimg.com/736x/9e/5d/6d/9e5d6d88ba0e9f1b5f045f820375517f.jpg",
            userName = "anyageraldine"
        ),
    )

    val posts = listOf(
        Post(
            id = 2,
            date = "2 jam yang lalu",
            desc = "Beautiful day",
            like = 1400,
            imageUrl = "https://i.pinimg.com/736x/41/a9/89/41a9899bfae4142de5f2022e46b386ba.jpg",
            username = "jkt48.marsha",
            imagepost = "https://i.pinimg.com/564x/50/f1/7c/50f17c380525acf16c5ad8df185b1554.jpg"
        ),
        Post(
            id = 3,
            date = "51 menit yang lalu",
            desc = "ganteng kali",
            like = 950,
            imageUrl = "https://i.pinimg.com/736x/51/2b/03/512b03e8728f90be4fcfb89cf0ac0046.jpg",
            username = "jkt48.freya",
            imagepost = "https://i.pinimg.com/736x/3b/89/55/3b8955693006933f1a8b4f9eb26ba2f8.jpg"
        ),
        Post(
            id = 4,
            date = "31 menit yang lalu",
            desc = "Good Morning",
            like = 753,
            imageUrl = "https://i.pinimg.com/736x/12/df/58/12df581b2fcdc6efb50e9bdcf847dbac.jpg",
            username = "jkt48.michie_",
            imagepost = "https://i.pinimg.com/736x/b3/f2/1a/b3f21ab021764ab8f5ddc3fa9c03d482.jpg"
        ),
        Post(
            id = 5,
            date = "2 hari yang lalu",
            desc = "Nihhon",
            like = 1241,
            imageUrl = "https://i.pinimg.com/736x/9e/5d/6d/9e5d6d88ba0e9f1b5f045f820375517f.jpg",
            username = "anyageraldine",
            imagepost = "https://i.pinimg.com/564x/77/6e/0f/776e0ff1648198e6f3684c627312ce0b.jpg"
        )
    )

    val BottomBarItems = listOf(
        NavigationItem(
            title = "Home",
            screen = Screen.Home,
            selected = Icons.Default.Home,
            unselected = Icons.Filled.Home
        ),
        NavigationItem(
            title = "Search",
            screen = Screen.Search,
            selected = Icons.Default.Search,
            unselected = Icons.Filled.Search
        ),
        NavigationItem(
            title = "add_Posting",
            screen = Screen.AddPosting,
            selected = Icons.Default.AddBox,
            unselected = Icons.Filled.AddBox
        ),
        NavigationItem(
            title = "Reels",
            screen = Screen.Reels,
            selected = Icons.Default.VideoLibrary,
            unselected = Icons.Filled.VideoLibrary
        ),
        NavigationItem(
            title = "Profile",
            screen = Screen.Profile,
            selected = Icons.Default.AccountCircle,
            unselected = Icons.Filled.AccountCircle
        )
    )

    val SearchContent = listOf(
        Content(
            contents = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/0d/d2/72/0dd2728d9d65fdb0c8e15b207c8bf183.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/e0/ee/b1/e0eeb1dab91203c59fed52709d176bd5.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/7e/03/a2/7e03a2607b471a0cb4d3931b01478f31.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/59/54/61/59546197baae43e5cd4612bbe1d4424d.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/02/ce/81/02ce8183d414d1b3f4f7da7ae4ab74a8.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/77/77/1f/77771f0a1a5f76097629144994c67fb1.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/0d/d2/72/0dd2728d9d65fdb0c8e15b207c8bf183.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/e0/ee/b1/e0eeb1dab91203c59fed52709d176bd5.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/7f/8d/ed/7f8dedce6226721df130259857244197.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/7e/03/a2/7e03a2607b471a0cb4d3931b01478f31.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/564x/59/54/61/59546197baae43e5cd4612bbe1d4424d.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/02/ce/81/02ce8183d414d1b3f4f7da7ae4ab74a8.jpg"
        ),
        Content(
            contents = "https://i.pinimg.com/736x/77/77/1f/77771f0a1a5f76097629144994c67fb1.jpg"
        ),
    )
}