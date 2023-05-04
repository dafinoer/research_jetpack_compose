package com.dafinrs.myhero.repository

import com.dafinrs.myhero.R
import com.dafinrs.myhero.model.Hero

class SuperHeroRepository {

    fun loadSuperHero(): List<Hero>{
        val result = listOf(
            Hero(
                nameRes = R.string.hero1,
                desc = R.string.description1,
                imageRes = R.drawable.android_superhero1
            ),
            Hero(
                nameRes = R.string.hero2,
                desc = R.string.description2,
                imageRes = R.drawable.android_superhero2
            ),
            Hero(
                nameRes = R.string.hero3,
                desc = R.string.description3,
                imageRes = R.drawable.android_superhero3
            ),
            Hero(
                nameRes = R.string.hero4,
                desc = R.string.description4,
                imageRes = R.drawable.android_superhero4
            ),
            Hero(
                nameRes = R.string.hero5,
                desc = R.string.description5,
                imageRes = R.drawable.android_superhero5
            ),
            Hero(
                nameRes = R.string.hero6,
                desc = R.string.description6,
                imageRes = R.drawable.android_superhero6
            )
        )

        return result
    }
}