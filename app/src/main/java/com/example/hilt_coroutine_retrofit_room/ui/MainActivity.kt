package com.example.hilt_coroutine_retrofit_room.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt_coroutine_retrofit_room.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}