package com.example.transportation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Transportation(
    @StringRes val carName: Int,
    @StringRes val speedCar: Int,
    @DrawableRes val carImg: Int
    )