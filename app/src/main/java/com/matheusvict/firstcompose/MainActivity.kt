package com.matheusvict.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.matheusvict.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeTheme {
                FirstScreen()

            }
        }
    }

    @Composable
    private fun FirstScreen() {
        Column() {
            Text(
                text = "Hello world"
            )
            Text(
                text = "Matheus"
            )
            Text(
                text = "Matheus"
            )
        }

    }
    
    @Preview
    @Composable
    private fun FirstScreenPreview() {
        FirstScreen()
    }
}

