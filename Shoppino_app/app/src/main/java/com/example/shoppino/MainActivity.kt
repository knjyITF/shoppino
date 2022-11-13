package com.example.shoppino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

data class Flyer(val name:String, val cabbage:Int, val potato:Int)



//data class  Super()

class MainActivity : AppCompatActivity() {
    //スーパーの一覧
    val superA = Flyer("スーパーA", 1200, 300)
    val superB = Flyer("スーパーB", 800, 900)
    val superC = Flyer("スーパーC",1000,2000)
    val flyerList = mutableListOf<Flyer>()

    override fun onCreate(savedInstanceState: Bundle?) {
        flyerList.add(superA)
        flyerList.add(superB)
        flyerList.add(superC)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val list = findViewById<ListView>(R.id.list)

        button.setOnClickListener {
            if(editText.text.toString() == "キャベツ")
            {
                flyerList.sortBy { it.cabbage }
                textView.text = "キャベツの一番安い店は" + flyerList.first().name
                //ListViewで表示する文字列を格納するviewListの生成
                val viewList = mutableListOf<String>()
                for(i in 0 until flyerList.size)
                {
                    viewList.add(flyerList.get(i).name + "のキャベツ : " + flyerList.get(i).cabbage + "円")
                }
                //アダプター
                list.adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    viewList
                )
            }
            else if(editText.text.toString() == "ジャガイモ" ||editText.text.toString() =="じゃがいも")
            {
                flyerList.sortBy{ it.potato }
                textView.text = "じゃがいもの安い店は" + flyerList.first().name
                //ListViewで表示する文字列を格納するviewListの生成
                val viewList = mutableListOf<String>()
                for(i in 0 until flyerList.size)
                {
                    viewList.add(flyerList.get(i).name + "のじゃがいも : " + flyerList.get(i).potato + "円")
                }
                //アダプター
                list.adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    viewList
                )
            }
            if(editText.text.isEmpty())
            {
                textView.text = ""
                val viewList = mutableListOf<String>()
                for(i in 0 until flyerList.size)
                {
                    viewList.add("")
                }
                //アダプター
                list.adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    viewList
                )
            }
        }


    }
}