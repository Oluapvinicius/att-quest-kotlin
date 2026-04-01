package com.example.aplicativoquizzatron.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aplicativoquizzatron.R

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.quiz),
        modifier = Modifier.size(142.dp),
        contentDescription = "",
        alignment = Alignment.TopCenter
    )
}

@Composable
fun LogoPequena(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.quiz),
        modifier = Modifier.size(92.dp),
        contentDescription = "",
        alignment = Alignment.TopCenter
    )
}