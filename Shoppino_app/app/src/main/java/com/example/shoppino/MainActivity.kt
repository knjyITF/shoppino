package com.example.shoppino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

data class Flyer(val name:String, val cabbage:Int, val potato:Int)
val superA = Flyer("スーパーA", 500, 300)
val superB = Flyer("スーパーB", 800, 900)
val superC = Flyer("C",1000,2000)
val flyerList = mutableListOf(superA, superB,superC)


class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "com.example.shoppino.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)

        button.setOnClickListener {
            val intent = Intent(application, ResultActivity::class.java)
            val data = editText.text
            intent.putExtra(EXTRA_MESSAGE,data)
            startActivity(intent)
        }
    }
}