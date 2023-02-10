package com.fyp.firstcomposeapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ImageCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ImageCardActivityPreview();

        }
    }

}

@Preview
@Composable
fun ImageCardActivityPreview() {
    val painter = painterResource(id = R.drawable.univ)
    val description = "Anna University"
    val title = "Anna University"
    ImageCard(painter = painter, contentDescription = description, title = title)
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
        elevation = 4.dp,
    ){
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier.fillMaxSize()
                .background(brush = Brush.verticalGradient(colors = listOf(
                    Color.Transparent,Color.Black
                ),
//                startY = 300f,
                    )))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
               Text(text = buildAnnotatedString{
                   withStyle(style = SpanStyle(color = Color.Green, fontSize = 50.sp)) {
                   append("H")
               }
                   append("ello")

             }, style = TextStyle(color = Color.White, fontSize = 16.sp ))
            }
        }


    }

}