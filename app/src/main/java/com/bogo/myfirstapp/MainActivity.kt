package com.bogo.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var numberOneEt: EditText
    private lateinit var numberTwoEt: EditText
    private lateinit var calculateBtn: Button
    private lateinit var resultTv: TextView

    private var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOneEt =findViewById(R.id.numberOneEt)
        numberTwoEt =findViewById(R.id.numberTwoEt)
        calculateBtn =findViewById(R.id.calcutatorBtn)
        resultTv =findViewById(R.id.resultTV)

        if(savedInstanceState != null){
            sum = savedInstanceState.getInt("sum")
            resultTv.text = sum.toString()
        }


        calculateBtn.setOnClickListener {
            val n1String = numberOneEt.text.toString()
            val n2String = numberTwoEt.text.toString()
            val n1 =n1String.toInt()
            val n2 =n2String.toInt()
            sum = n1 + n2
            resultTv.text = sum.toString()

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("sum", sum)
        super.onSaveInstanceState(outState)
    }

}