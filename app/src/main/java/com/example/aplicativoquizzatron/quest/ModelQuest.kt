package com.example.aplicativoquizzatron.quest

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun ModelQuest(modifier: Modifier = Modifier) {
    var steps by remember { mutableStateOf(0) }
}