package com.iceman.diceroller.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iceman.diceroller.R


@Composable
fun ImageDice(idResource : Int) {
    Image(
        painter = painterResource(id = resultDrawerDiceByIndex(idResource)),
        contentDescription = "Dice",
        Modifier.size(200.dp)
    )
}

fun resultDrawerDiceByIndex(index: Int): Int = when (index) {
    1 -> R.drawable.dice_1
    2 -> R.drawable.dice_2
    3 -> R.drawable.dice_3
    4 -> R.drawable.dice_4
    5 -> R.drawable.dice_5
    else -> R.drawable.dice_6
}