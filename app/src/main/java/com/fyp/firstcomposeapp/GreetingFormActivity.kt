package com.fyp.firstcomposeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import java.time.Duration

class GreetingFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            GreetingFormActivityPreview()
        }
    }
}


@Preview
@Composable
fun GreetingFormActivityPreview(){
    val context1 = LocalContext.current
    val scaffoldState = rememberScaffoldState();
    var textFieldState by remember {
        mutableStateOf(value="")
    }

    val scope = rememberCoroutineScope()


    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            TextField(value = textFieldState, onValueChange = {
                textFieldState = it
            }, singleLine = true,
                label ={
                    Text(text = "Enter Name")
            })

            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { scope.launch {
                //scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                Toast.makeText(context1,"this is toast message",Toast.LENGTH_SHORT).show()

            }
            }) {

            }
        }
    }


}