package com.example.audioplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        initMediaPlayer()

    }

    private fun initMediaPlayer() {
//        val mediaPlayerInstance = MediaPlayer.create(this,)
    }
}