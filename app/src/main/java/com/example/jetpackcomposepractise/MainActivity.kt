package com.example.jetpackcomposepractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent

class MainActivity : AppCompatActivity() {
//    Tutorial on https://developer.android.com/jetpack/compose/tutorial
//    Jetpack Compose simplifies and accelerates UI development
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        The setContent block defines the activity's layout instead of defining the layout contents with an XML file
//        This is called a composable function
//        The Text() function is an example defined by Compose UI library

//      Composable functions can only be called from within the scope of other composable functions.
        setContent{
//            Text("Hello compose")
            Greeting("Android")
        }
    }

//    To make a Composable, add the @Composable annotation and then define the function which is passed as a name
    @Composable
    fun Greeting (name: String) {
        Text(text = "Hello $name")
    }
}
