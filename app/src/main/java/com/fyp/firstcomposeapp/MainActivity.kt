package com.fyp.firstcomposeapp

import android.graphics.drawable.ShapeDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fyp.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview();
        }
    }
}

@Composable
fun Greeting(name: String) {
//    Text(text = "Hello $name!",
//        modifier = Modifier.fillMaxWidth()
//
//
//    )

    Column(modifier = Modifier.fillMaxSize()
        .border(5.dp, Color.Cyan)
        , horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Button(
            onClick = { /*TODO*/

            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth(0.6F),

        ) {
            Text(text = "Click me")
        }


//        Button(
//            onClick = { /*TODO*/
//            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
//            modifier = Modifier.background(Color.Red)
//                .fillMaxWidth(0.8F)
//        ) {
//            Text(text = "yo")
//        }
    }

}

@Composable
fun buttonPressedText(){
    Text(text = "button was pressed")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        Greeting("bro")

}