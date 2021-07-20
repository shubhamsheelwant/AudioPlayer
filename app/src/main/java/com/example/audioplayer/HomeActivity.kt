package com.example.audioplayer

import android.app.Activity
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.audioplayer.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {

    private val TAG = "HomeActivity"

    val audioList: ArrayList<SongModel> = ArrayList()
    private lateinit var mediaPlayerInstance: MediaPlayer

    lateinit var binding: HomeActivityBinding
    
    var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initList()
        initMediaPlayer(currentIndex)
        initClickListener()

    }

    private fun initClickListener() {

        binding.btnPlay.setOnClickListener {
            if( !mediaPlayerInstance.isPlaying){
                binding.btnPlay.setText("Pause")
                mediaPlayerInstance.start()
            } else {
                binding.btnPlay.setText("Play")
                mediaPlayerInstance.pause()
            }
        }

        binding.btnNext.setOnClickListener {
            if (mediaPlayerInstance.isPlaying)
                mediaPlayerInstance.stop()
            if(currentIndex == audioList.size - 1){
                currentIndex = 0
            } else {
                currentIndex ++
            }
            initMediaPlayer(currentIndex)
            mediaPlayerInstance.start()
        }

        binding.btnPrev.setOnClickListener {
            if (mediaPlayerInstance.isPlaying)
                mediaPlayerInstance.stop()
            if(currentIndex == 0){
                currentIndex = audioList.size - 1
            } else {
                currentIndex --
            }
            initMediaPlayer(currentIndex)
            mediaPlayerInstance.start()

        }

        binding.btnStop.setOnClickListener {
            if (mediaPlayerInstance.isPlaying){
                mediaPlayerInstance.stop()
            }
        }
    }

    private fun initList() {
        audioList.add(SongModel("Ring-1","Title-1","",R.raw.ring1))
        audioList.add(SongModel("Ring-2","Title-2","",R.raw.ring2))
        audioList.add(SongModel("Ring-3","Title-3","",R.raw.ring3))
        audioList.add(SongModel("Ring-4","Title-4","",R.raw.ring4))
        audioList.add(SongModel("Ring-5","Title-5","",R.raw.ring5))
        audioList.add(SongModel("Ring-6","Title-6","",R.raw.ring6))
        audioList.add(SongModel("Ring-7","Title-7","",R.raw.ring7))
    }

    private fun initMediaPlayer(currentIndex: Int) {
         mediaPlayerInstance = MediaPlayer.create(this, audioList[currentIndex].audio)
//         binding.imageSong.setImageURI(audioList[currentIndex].image)

    }
}