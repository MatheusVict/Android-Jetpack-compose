package com.matheusvict.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

        Row(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            Arrangement.Center,
        ) {
            Surface(
                color = Color.Red,
                modifier = Modifier.width(100.dp).height(100.dp)
            ) {}

            Surface(
                color = Color.Blue,
                modifier = Modifier.width(100.dp).height(100.dp)
            ) {}

            Surface(
                color = Color.Black,
                modifier = Modifier.width(100.dp).height(100.dp)
            ) {}
        }

    }

    @Preview
    @Composable
    private fun FirstScreenPreview() {
        FirstScreen()
    }
}

