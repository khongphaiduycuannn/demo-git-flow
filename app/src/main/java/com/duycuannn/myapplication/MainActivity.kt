package com.duycuannn.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "I'm Duy", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "I'm Duy", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "I'm Duy", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "I'm Duy", Toast.LENGTH_SHORT).show()
    }
}