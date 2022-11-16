package com.example.program

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c = findViewById<Button>(R.id.K)
        c.setOnClickListener {
            val intent = Intent(this, Athletes::class.java)
            startActivity(intent)
        }
    }
    }
