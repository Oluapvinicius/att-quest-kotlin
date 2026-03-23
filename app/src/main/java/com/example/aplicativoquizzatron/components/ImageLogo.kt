package com.example.aplicativoquizzatron.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.aplicativoquizzatron.R

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.quiz),
        modifier = Modifier,
        contentDescription = "",
        alignment = Alignment.TopCenter
    )
}