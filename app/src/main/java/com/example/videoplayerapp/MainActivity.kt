package com.example.videoplayerapp

import android.media.session.MediaController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.example.videoplayerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }
       private fun initialize(){
          with(binding){
              videoView.setVideoPath("android.resource://"
                      +packageName+"/"
                      +R.raw.sunrise
              )
              val mediaController = android.widget.MediaController(this@MainActivity)
              mediaController.setAnchorView(videoView)
              mediaController.setMediaPlayer(videoView)
              videoView.setMediaController(mediaController)
              videoView.start()
          }

        }




}