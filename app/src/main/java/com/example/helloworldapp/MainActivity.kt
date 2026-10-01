package com.example.helloworldapp

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
    }
}