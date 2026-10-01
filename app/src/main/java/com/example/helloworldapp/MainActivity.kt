package com.example.helloworldapp

import android.widget.LinearLayout
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // show our layout on the screen
        setContentView(R.layout.activity_main)

        // find the text and the button from layout
        val TextViewMain = findViewById<TextView>(R.id.TextViewMain)
        val ButtonChangeText = findViewById<Button>(R.id.ButtonChangeText)

        // when we click the button, text will change
        ButtonChangeText.setOnClickListener {
            TextViewMain.text = "Button was clicked!"
        }

        // find the second button
        val ButtonChangeTextColor = findViewById<Button>(R.id.ButtonChangeTextColor)

        // find the third button and the main layout
        val ButtonChangeBackground = findViewById<Button>(R.id.ButtonChangeBackground)
        val LayoutMain = findViewById<LinearLayout>(R.id.main)

        // when we click, background becomes yellow
        ButtonChangeBackground.setOnClickListener {
            LayoutMain.setBackgroundColor(Color.YELLOW)
        }

        // when we click, text becomes red
        ButtonChangeTextColor.setOnClickListener {
            TextViewMain.setTextColor(Color.RED)
        }
    }
}