package com.johnbosco.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but = findViewById<Button>(R.id.rgb)

        but.setOnClickListener {
            val bin = Intent(this,home::class.java)
            startActivity(bin)
        }
    }
}