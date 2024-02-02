@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposecourse

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ColorBox(modifier = Modifier
                .padding(14.dp)
                .height(500.dp)
                .width(800.dp))

            Scaffold {


            }
        }
    }
}


@Composable
fun ColorBox(modifier: Modifier) {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }





    Box(modifier = modifier
        .background(
            color.value
        )
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(), 1f
            )
        }) {


    }
}
