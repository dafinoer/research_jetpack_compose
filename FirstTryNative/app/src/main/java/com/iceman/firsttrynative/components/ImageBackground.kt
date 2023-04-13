package com.iceman.firsttrynative.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.iceman.firsttrynative.R


@Composable
fun ImageBackgound() {
    val imageItem = painterResource(id = R.drawable.bg_compose_background)

    Image(
        painter = imageItem,
        contentDescription = "Lorem ipsum",
        contentScale = ContentScale.Crop,
        modifier = Modifier.aspectRatio(1.7f)
    )
}