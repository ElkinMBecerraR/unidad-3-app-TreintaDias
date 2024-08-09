package com.elkin.treintadias.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.elkin.treintadias.R

val Guter = FontFamily(
    Font(R.font.gupter_regular),
    Font(R.font.gupter_medium),
    Font(R.font.gupter_bold),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Guter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Guter,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Guter,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Guter,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)