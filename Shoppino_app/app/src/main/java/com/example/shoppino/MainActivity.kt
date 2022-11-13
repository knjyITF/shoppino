package com.example.shoppino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

data class Super(val kyabetu:Int,val potato:Int)
val SuperA = Super(50000,300)
val SuperB = Super(200,500)
//data class  Super()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        button.setOnClickListener {
            if(editText.text.toString() == "キャベツ") {
                if(SuperA.kyabetu > SuperB.kyabetu){
                    textView.text = "スーパーB"
                } else if(SuperA.kyabetu == SuperB.kyabetu){
                    textView.text = "同じです"
                }else {
                    textView.text = "同じです"
                }
            }
            if(editText.text.isEmpty())
            {
                textView.text = ""
            }
        }
    }
}