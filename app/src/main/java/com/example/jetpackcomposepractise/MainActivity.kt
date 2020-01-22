package com.example.jetpackcomposepractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import kotlin.random.Random

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
//            MaterialTheme {
//                Greeting("Android")
//            }
            NewsStory()
        }
    }

    //    To make a Composable, add the @Composable annotation and then define the function which is passed as a name
    @Composable
    fun Greeting (name: String) {
        Text(text = "Hello $name")
    }

//    Use @Preview to view the UI in android studio
//    @Preview
//    @Composable
//    fun DefaultPreview() {
//        MaterialTheme() {
//            Greeting("Fatah")
//        }
//    }

}

//    Layouts
//    UI elements are hierarchical, with elements contained in other elements.
//    In Compose you can build a UI hierarchy by calling composable functions from other composable functions

@Composable
fun NewsStory() {
    val image = +imageResource(R.drawable.orange)
    Column(
//        This acts as styling by passing parameters
        modifier = Spacing(16.dp)
    ) {
        Container(modifier = Height(180.dp) wraps Expanded) {
            DrawImage(image)
        }
        
        HeightSpacer(height = 16.dp)

        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}