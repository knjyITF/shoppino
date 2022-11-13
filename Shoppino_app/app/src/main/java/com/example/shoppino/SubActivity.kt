package com.example.shoppino

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub_main)
        val btnUser = findViewById<Button>(R.id.user)
        btnUser.setOnClickListener { v ->
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
        }
    }
}