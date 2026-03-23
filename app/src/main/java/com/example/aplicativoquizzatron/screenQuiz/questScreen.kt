package com.example.aplicativoquizzatron.screenQuiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aplicativoquizzatron.R
import com.example.aplicativoquizzatron.components.Logo

@Composable
fun ScreenQuest(modifier: Modifier = Modifier) {


        Box(modifier = Modifier.fillMaxSize()){
            Column(modifier = Modifier.fillMaxSize()) {
            Logo(modifier = modifier)
            Text(text = "QUIZATRON 3000")
                Button(onClick = {},
                    ) { }
        }
    }

}