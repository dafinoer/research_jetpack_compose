package com.iceman.diceroller.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.iceman.diceroller.R
import com.iceman.diceroller.ui.theme.Purple500


@Composable
fun ButtonRoller(onClick: () -> Unit) {
    val config = LocalConfiguration.current;

    Button(
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Purple500),
        onClick = onClick,
        modifier = Modifier
            .width((config.screenWidthDp * 0.5).dp)
            .padding(horizontal = 16.dp, vertical = 16.dp),
    ) {
        Text(
            text = stringResource(id = R.string.button_roll),
            style = TextStyle(
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}