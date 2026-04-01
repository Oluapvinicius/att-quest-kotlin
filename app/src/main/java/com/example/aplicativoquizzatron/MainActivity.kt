package com.example.aplicativoquizzatron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicativoquizzatron.screenQuiz.AnswerQuestion
import com.example.aplicativoquizzatron.screenQuiz.Resultado
import com.example.aplicativoquizzatron.screenQuiz.ScreenQuest
import com.example.aplicativoquizzatron.ui.theme.AplicativoQuizzatronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplicativoQuizzatronTheme {

                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = "login") {
                            ScreenQuest(modifier = Modifier, navController)
                        }

                        composable(route = "Menu") {
                            AnswerQuestion(modifier = Modifier, navController)
                        }
                        composable (route = "Resultado") {
                            Resultado(navController)
                        }

                    }
            }
        }
    }
}
}