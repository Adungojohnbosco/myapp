package com.johnbosco.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val stat = findViewById<Button>(R.id.RGF)
        stat.setOnClickListener {
            val jo = Intent(this,MainActivity::class.java)
            startActivity(jo)
        }
    }
}