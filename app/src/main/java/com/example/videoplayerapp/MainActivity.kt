package com.example.videoplayerapp

import android.media.session.MediaController
import android.net.Uri
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

              //Media controller 1
              val mediaController = android.widget.MediaController(this@MainActivity)
              mediaController.setAnchorView(videoView)
              mediaController.setMediaPlayer(videoView)
              videoView.setMediaController(mediaController)
              //Start video
              videoView.start()

              //Video 2 uri
              val uri = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4")
              videoView2.setVideoURI(uri)

              //Media controller 2
              val mediaController2 = android.widget.MediaController(this@MainActivity)
              mediaController2.setAnchorView(videoView2)
              mediaController2.setMediaPlayer(videoView2)
              videoView2.setMediaController(mediaController2)
              //Start video
              videoView2.start()
          }

        }




}