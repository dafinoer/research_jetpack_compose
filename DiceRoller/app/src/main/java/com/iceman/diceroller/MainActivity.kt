package com.iceman.diceroller


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.iceman.diceroller.ui.theme.DiceRollerTheme
import com.iceman.diceroller.widgets.ButtonRoller
import com.iceman.diceroller.widgets.ImageDice

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                DiceApp()
            }
        }
    }
}

@Composable
fun DiceApp() {
    var result by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ImageDice(result)
        ButtonRoller() {
            result = (1..6).random()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DevicePreviewApp() {
    DiceRollerTheme {
        DiceApp()
    }
}
