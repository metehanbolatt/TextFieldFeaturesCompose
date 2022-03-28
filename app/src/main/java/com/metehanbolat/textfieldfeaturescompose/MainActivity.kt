package com.metehanbolat.textfieldfeaturescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.metehanbolat.textfieldfeaturescompose.ui.theme.TextFieldFeaturesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldFeaturesComposeTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var textFieldState by remember { mutableStateOf("") }

        TextField(
            value = textFieldState,
            onValueChange = { textFieldState = it },
            label = { Text(text = "Enter Your Name") },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Person Icon")
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.Red,
                focusedLabelColor = Color.Blue,
                backgroundColor = Color.Magenta.copy(alpha = 0.2f),
                leadingIconColor = Color.Black,
                focusedIndicatorColor = Color.Yellow,
                unfocusedIndicatorColor = Color.Yellow.copy(alpha = 0.2f),
                cursorColor = Color.Black,
                textColor = Color.Blue
            ),
            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
        )

        TextField(
            value = textFieldState,
            onValueChange = { textFieldState = it },
            label = { Text(text = "Enter Your Name") },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Person Icon")
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.Red,
                focusedLabelColor = Color.Blue,
                backgroundColor = Color.Magenta.copy(alpha = 0.2f),
                leadingIconColor = Color.Black,
                focusedIndicatorColor = Color.Yellow,
                unfocusedIndicatorColor = Color.Yellow.copy(alpha = 0.2f),
                cursorColor = Color.Black,
                textColor = Color.Blue
            ),
            shape = CutCornerShape(topStart = 25.dp, topEnd = 25.dp)
        )
    }
}