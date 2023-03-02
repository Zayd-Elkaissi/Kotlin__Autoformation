package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    val textView: TextView = findViewById(R.id.textview)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = Datasource().loadAffirmations().size.toString()
    }



}