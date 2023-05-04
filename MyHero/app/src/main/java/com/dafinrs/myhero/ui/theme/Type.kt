package com.dafinrs.myhero.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dafinrs.myhero.R

val CabinFontFamily = FontFamily(
    Font(R.font.cabin_bold),
    Font(R.font.cabin_regular)
)

// Set of Material typography styles to start with
// Baseon guideline https://m3.material.io/styles/typography/type-scale-tokens#40fc37f8-3269-4aa3-9f28-c6113079ac5d
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = CabinFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = CabinFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = CabinFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = CabinFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
)