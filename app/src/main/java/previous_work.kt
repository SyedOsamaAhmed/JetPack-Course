//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.text.withStyle

//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.MutableState
//import androidx.compose.foundation.layout.width
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import kotlin.random.Random
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.fillMaxWidth
//import com.example.jetpackcomposecourse.ui.theme.JetPackComposeCourseTheme
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.foundation.Image
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.unit.sp
//import androidx.compose.foundation.layout.height

//import androidx.compose.foundation.layout.padding
//
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//
//import androidx.compose.material3.Text


//            val painter = painterResource(id = R.drawable.desert_sunset)
//            val description = "Sunset Dessert"
//            val title = "Sunset View in Dessert"
//            val fontFamily= FontFamily(
//                Font(R.font.manrope_light, FontWeight.Light),
//                Font(R.font.manrope_medium, FontWeight.Medium),
//                Font(R.font.manrope_regular, FontWeight.Normal),
//                Font(R.font.manrope_bold, FontWeight.Bold),
//                Font(R.font.manrope_semibold, FontWeight.SemiBold),
//                Font(R.font.manrope_extrabold, FontWeight.ExtraBold),
//                Font(R.font.manrope_extralight, FontWeight.ExtraLight),
//
//
//            )


// Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, contentDescription = description, title = title)
//
//
//                Text(buildAnnotatedString {
//                                          withStyle(
//                                              style = SpanStyle(color=Color.Blue, fontSize = 40.sp,
//                                                  FontWeight.Bold,letterSpacing = 0.5.em
//                                             )
//
//                                          ){
//                                              append("J")
//                                          }
//
//                    append("etPack ")
//                    withStyle(
//                        style = SpanStyle(color=Color.Blue, fontSize = 40.sp, letterSpacing = 0.5.em)
//
//                    ){
//                        append("C")
//                    }
//                    append("ompose")
//
//
//                }, style = TextStyle(Color.Magenta, fontSize = 30.sp,fontFamily=fontFamily, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline, textAlign = TextAlign.Center))
//            }


//            JetPackComposeCourseTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    //Arrangement for main axis and alignment for cross axis
//                Column(
//                    Modifier
//                        .background(Color.LightGray)
//                        .fillMaxSize()
//                        .padding(horizontal = 18.dp)) {
//                    Text(text = "Hello")
//                    Spacer(modifier = Modifier.height(30.dp))
//                    Text(text = "World")
//                    Text(text = "Osama", modifier = Modifier.offset(50.dp,20.dp))
//                    Spacer(modifier = Modifier.height(30.dp))
//
//                    //Note: Modifier properties apply sequentially and properties can be repeated
//                    Row(
//                        Modifier
//                            .background(Color.Magenta)
//                            .width(500.dp)
//                            .height(300.dp)
//                            .border(
//                                5.dp, Color.Blue
//                            )
//                            .padding(4.dp)
//                            .border(6.dp, Color.Gray)
//                            .padding(5.dp)
//                            .border(7.dp, Color.Yellow), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
//                        Text(text = "item 1")
//                        Text(text = "item 2")
//                        Text(text = "item 3")
//                    }
//                }
//                }
//            }


//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//
//    ) {
//
//    Card(
//
//        shape = RoundedCornerShape(15.dp),
//        elevation = CardDefaults.cardElevation(5.dp),
//    ) {
//        Box(Modifier.height(200.dp)) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop
//            )
//
//            Box(
//                modifier = Modifier
//                    .background(
//                        Brush.verticalGradient(
//                            colors = listOf(
//                                Color.Transparent,
//                                Color.DarkGray
//                            ),
//                            startY = 300f
//
//                        )
//                    )
//                    .fillMaxSize()
//            )
//
//            Text(
//                text = title, style = TextStyle(Color.White, fontSize = 16.sp), modifier = Modifier
//                    .align(
//                        Alignment.BottomStart
//                    )
//                    .padding(12.dp)
//            )
//
//        }
//    }
//}