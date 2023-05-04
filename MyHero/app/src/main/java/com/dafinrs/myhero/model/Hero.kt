package com.dafinrs.myhero.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val desc: Int,
    @DrawableRes val imageRes: Int
)
