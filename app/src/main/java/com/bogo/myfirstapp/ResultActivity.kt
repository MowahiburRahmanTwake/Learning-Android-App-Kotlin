package com.bogo.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var sumTv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        sumTv = findViewById(R.id.sumTV)
        val sum = intent.getIntExtra("sum",0)
        sumTv.text = sum.toString()

    }
}