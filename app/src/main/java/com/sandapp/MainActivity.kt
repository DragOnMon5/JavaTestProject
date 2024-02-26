package com.sandapp

import  android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandapp.databinding.ActivityMainScreenBinding
import com.sandapp.ui.theme.SAndAppTheme
import java.math.BigDecimal
import java.math.RoundingMode

import kotlin.math.round


class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainScreenBinding
    var score:Float = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButton.setOnClickListener { onPurpleClick() }
    }

    fun onPurpleClick() {
        binding.imageButton.rotation += 2
        binding.imageButton.scaleX += 0.04f
        binding.imageButton.scaleY += 0.04f
        score = round((5 - binding.imageButton.scaleX) * 100) / 100
        changeScore(score.toString())
        if (binding.imageButton.scaleX >= 5f) {
            changeLayout(R.layout.side_screen)
        }
    }

    fun changeLayout(screen_id : Int) {
        setContentView(screen_id)
    }

    fun changeScore(newScore: String) {
        binding.textScore.text = newScore
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