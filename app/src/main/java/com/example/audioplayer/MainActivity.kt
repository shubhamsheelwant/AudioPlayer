package com.example.audioplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.audioplayer.View.HomeActivity
import com.example.audioplayer.View.SongsListActivity
import com.example.audioplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickListener()
    }

    private fun initClickListener() {
        binding.btnSignIn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.btnSongsList.setOnClickListener {
            val intent = Intent(this, SongsListActivity::class.java)
            startActivity(intent)
        }
    }
}