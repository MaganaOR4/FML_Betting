package com.example.fmlbetting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1000)
        setTheme(R.style.Theme_FMLBetting)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}