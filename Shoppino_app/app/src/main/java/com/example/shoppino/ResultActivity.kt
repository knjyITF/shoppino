package com.example.shoppino

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        val EXTRA_MESSAGE = "com.example.shoppino.MESSAGE"
        super.onCreate(savedInstanceState)
        val resultText = findViewById<TextView>(R.id.result)
        setContentView(R.layout.activity_result)

        val message = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)



    }
}