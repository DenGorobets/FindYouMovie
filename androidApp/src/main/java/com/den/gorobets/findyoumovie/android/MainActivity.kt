package com.den.gorobets.findyoumovie.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.den.gorobets.findyoumovie.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                App()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        App()
    }
}
