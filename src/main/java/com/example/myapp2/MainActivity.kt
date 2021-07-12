package com.example.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() { //extending compatactivity

  // val foodlist = arrayListOf("Chinese","hamburger","pizza","ice cream")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodlist = arrayListOf("Chinese","hamburger","pizza","ice cream")
        var buton1: Button = findViewById(R.id.decideBtn)
        var text1: TextView =findViewById(R.id.selectedFoodTxt)
        var buton2: Button = findViewById(R.id.addFoodBtn)
        var text2: EditText = findViewById(R.id.addFoodTxt)

        buton1.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            text1.text= foodlist[randomFood]

        }
        buton2.setOnClickListener{
            val newfood = text2.text.toString()
            foodlist.add(newfood)
            text2.text.clear()
            println(foodlist)
        }
    }
}