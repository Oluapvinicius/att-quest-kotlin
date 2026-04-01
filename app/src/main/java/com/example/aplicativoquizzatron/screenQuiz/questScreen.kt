package com.example.aplicativoquizzatron.screenQuiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplicativoquizzatron.R
import com.example.aplicativoquizzatron.components.Logo
import org.intellij.lang.annotations.JdkConstants

@Composable
fun ScreenQuest(modifier: Modifier = Modifier,navController: NavController, nomeDigitado: String, onNomeChange: (String) -> Unit) {

    var nome = nomeDigitado

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Logo(modifier = modifier)

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "QUIZATRON 3000",
                fontSize = 35.sp
                )

                TextField(
                value = nomeDigitado,
                onValueChange = onNomeChange,
                label = {Text(text = "Digite o seu nome")},
                modifier = Modifier.padding(16.dp)
            )
            var usuarioNome by remember { mutableStateOf(nomeDigitado) }
            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {navController.navigate("Menu")},
                modifier = Modifier.fillMaxWidth(0.6f),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "COMEÇAR!")
            }
        }
    }


