package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn {

                itemsIndexed( listOf("This","is","JetPack","Compose","course")){

                        _, string->
                    Text(
                    string,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )

                }
//                items(5000,) {
//                    Text(
//                        "item $it",
//                        fontSize = 16.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//
//                }
            }


        }

//            ColorBox(modifier = Modifier.padding(14.dp).height(500.dp).width(800.dp))
    }
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
