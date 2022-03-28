package com.metehanbolat.textfieldfeaturescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.textfieldfeaturescompose.ui.theme.TextFieldFeaturesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldFeaturesComposeTheme {

            }
        }
    }
}