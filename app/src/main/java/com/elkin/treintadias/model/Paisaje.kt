package com.elkin.treintadias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Paisaje(
    @StringRes val nombre: Int,
    @StringRes val descripcion: Int,
    @DrawableRes val imagen: Int
)
