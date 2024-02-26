package com.sandapp

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandapp.ui.theme.SAndAppTheme


class MainActivity : ComponentActivity() {
    var screen_id = R.layout.activity_main_screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(screen_id)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var numberOfClicks: Int = 0

        imageButton.setOnClickListener { onPurpleClick(imageButton) }

    }

    fun onPurpleClick(imageButton: ImageButton) {
        imageButton.rotation += 2
        imageButton.scaleX += 0.04f
        imageButton.scaleY += 0.04f
        if (imageButton.scaleX >= 5f) {
            changeLayout()
        }
    }

    fun changeLayout() {
        setContentView(R.layout.side_screen)
    }
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