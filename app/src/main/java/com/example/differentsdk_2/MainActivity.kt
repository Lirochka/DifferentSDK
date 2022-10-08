package com.example.differentsdk_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.helloTextView)

        textView.text = (application as App).html.spannable("<HTML><TITLE>Title</TITLE></HTML>")

    }
}