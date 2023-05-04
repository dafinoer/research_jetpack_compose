package com.dafinrs.myhero.widgets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dafinrs.myhero.repository.SuperHeroRepository
import com.dafinrs.myhero.ui.theme.MyHeroTheme


@Composable
fun HeroBody(modifier: Modifier = Modifier) {

    val itemsResult = rememberSaveable(stateSaver = Saver(save = { it }, restore = { it })) {
        val repo = SuperHeroRepository()
        mutableStateOf(repo.loadSuperHero())
    }

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        content = {
            items(itemsResult.value) {
                HeroCardWidget(hero = it, modifier = Modifier.padding(vertical = 4.dp))
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewListHeroLight() {
    MyHeroTheme() {
        HeroBody()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListHeroDark() {
    MyHeroTheme(darkTheme = true) {
        HeroBody()
    }
}