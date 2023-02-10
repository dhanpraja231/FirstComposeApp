package com.fyp.firstcomposeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LazyColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { LazyColumnActivityPreview() }
    }
}

@Preview
@Composable
fun LazyColumnActivityPreview(){

    LazyColumn(){
//        items(1000) {
//            Text(text = "Item $it",
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                modifier =  Modifier.fillMaxWidth().padding(vertical = 24.dp)
//            )
//
//        }
        itemsIndexed(
            listOf("hey","bro","whats up","bro","whats up","bro","whats up","bro","whats up","bro","whats up","bro","whats up","bro","whats up","bro","whats up","bro","whats up")
        ){
            index, string ->
            Text(text = "$string is on index $index",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier =  Modifier.fillMaxWidth().padding(vertical = 24.dp)
            )
        }

    }


}