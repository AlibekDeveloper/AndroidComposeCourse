package com.example.a30dayapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wellness(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @DrawableRes val imageId: Int,
    @StringRes val description: Int
)
