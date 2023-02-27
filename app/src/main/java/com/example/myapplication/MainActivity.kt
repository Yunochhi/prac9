package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button
    var count:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick = findViewById(R.id.button_Click)
        buttonClick.setOnClickListener()
        {
            count++
            if (count % 2 == 0)
                Toast.makeText(this, R.string.kratno,Toast.LENGTH_SHORT ).show()
            else
                Toast.makeText(this, R.string.neKratno,Toast.LENGTH_SHORT ).show()
        }
    }











}