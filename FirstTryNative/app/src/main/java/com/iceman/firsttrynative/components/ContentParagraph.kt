package com.iceman.firsttrynative.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.iceman.firsttrynative.R
import java.nio.file.WatchEvent


@Composable
fun ContentParagraph() {
    Column {
        FirstParagraph()
        SecondParagraph()
    }
}

@Composable
private fun FirstParagraph() {
    val text = stringResource(id = R.string.first_paragraph)

    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
    )
}

@Composable
private fun SecondParagraph() {
    val text = stringResource(id = R.string.second_paragraph)
    Text(
        text = text, textAlign = TextAlign.Justify, modifier = Modifier.padding(
            horizontal = 16.dp
        )
    )
}