package com.sandapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.sandapp.databinding.ActivityMainScreenBinding
import kotlin.math.round

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainScreenBinding
    private var score: Float = 0f
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

    fun changeLayout(screen_id: Int) {
        setContentView(screen_id)
    }

    fun changeScore(newScore: String) {
        binding.textScore.text = newScore
    }
}



