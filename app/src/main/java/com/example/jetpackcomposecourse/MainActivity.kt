package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.ui.theme.JetPackComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    color = MaterialTheme.colorScheme.background
                ) {
                    //Arrangement for main axis and alignment for cross axis
                Column(
                    Modifier
                        .background(Color.LightGray)
                        .fillMaxSize()
                        .padding(horizontal = 18.dp)) {
                    Text(text = "Hello")
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(text = "World")
                    Text(text = "Osama", modifier = Modifier.offset(50.dp,20.dp))
                    Spacer(modifier = Modifier.height(30.dp))

                    //Note: Modifier properties apply sequentially and properties can be repeated
                    Row(
                        Modifier
                            .background(Color.Magenta)
                            .width(500.dp)
                            .height(300.dp)
                            .border(
                                5.dp, Color.Blue
                            )
                            .padding(4.dp)
                            .border(6.dp, Color.Gray)
                            .padding(5.dp)
                            .border(7.dp, Color.Yellow), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                        Text(text = "item 1")
                        Text(text = "item 2")
                        Text(text = "item 3")
                    }
                }
                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter:Painter,
    contentDescription:String,
    title:String,
    modifier: Modifier=Modifier
){

Card(
    modifier=modifier.fillMaxWidth(),
    shape = RoundedCornerShape(15.dp),
    elevation = CardDefaults.cardElevation(5.dp),
) {
        Box (Modifier.height(500.dp)){
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop )

            Box (
                Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart){
                Text(text = title)

            }

        }
}
}

