package com.sandapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sandapp.ui.theme.SAndAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*setContent {
            //SAndAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Text(text = "check", fontSize = 25.em)
                    //Print("Throughout Heaven and Earth...")
                    //GreetingPreview()
                }
            //}
        }*/

        setContentView(R.layout.activity_main_screen)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var numberOfClicks: Int = 0

        imageButton.setOnClickListener { onPurpleClick(imageButton) }


    }
}

fun onPurpleClick(imageButton : ImageButton){
    imageButton.rotation += 2
    imageButton.scaleX += 0.04f
    imageButton.scaleY += 0.04f
}

@Composable
fun Print(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SAndAppTheme {
        Print("Android")
    }
}