//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp




//val painter: Painter
//    @Composable
//    get() = painterResource(id = R.drawable.desert_sunset)
//val description = "Sunset Dessert"
//const val title = "Sunset View in Dessert"
//Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp)
//            ) {
//                ImageCard(painter = painter, contentDescription = description, title = title)
//
//
//
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