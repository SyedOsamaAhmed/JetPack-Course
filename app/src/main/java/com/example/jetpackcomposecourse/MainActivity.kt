package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar

import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment.Companion.BottomStart

import androidx.compose.ui.Alignment.Companion.CenterHorizontally

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Box

//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import kotlin.random.Random


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val snackBarHostState = remember { SnackbarHostState() }
            var textFieldVal by remember { mutableStateOf("") }
            val scope = rememberCoroutineScope()
            Scaffold { padding ->

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                    ) {

                        TextField(
                            value = textFieldVal,
                            label = { Text(text = "Enter text here") },
                            onValueChange = {
                                textFieldVal = it
                            },

                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(onClick = {
                            scope.launch {
                                snackBarHostState.showSnackbar(textFieldVal)
                            }
                        }) {
                            Text(text = "Greet")

                        }


                    }
                }
            Box(
                contentAlignment = BottomStart,
                modifier=Modifier.fillMaxSize()
            ) {
                SnackbarHost(snackBarHostState) { _ ->
                    Snackbar {
                        Text(text = textFieldVal)
                    }

                }
            }

            }


        }

//            ColorBox(modifier = Modifier.padding(14.dp).height(500.dp).width(800.dp))
    }




//@Composable
//fun ColorBox(modifier: Modifier) {
//    val color = remember {
//        mutableStateOf(Color.Yellow)
//    }
//
//
//
//
//
//    Box(modifier = modifier
//        .background(
//            color.value
//        )
//        .clickable {
//            color.value = Color(
//                Random.nextFloat(),
//                Random.nextFloat(),
//                Random.nextFloat(), 1f
//            )
//        }) {
//
//
//    }
//}
