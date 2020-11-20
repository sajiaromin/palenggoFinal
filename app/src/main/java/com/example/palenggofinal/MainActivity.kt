package com.example.palenggofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val op1 = findViewById<TextView>(R.id.textView)
        val op2 = findViewById<TextView>(R.id.textView2)
       // val benxt = findViewById<Button>(R.id.benbut).setOnClickListener{paymentMeth()}
        //val bawnxt = findViewById<Button>(R.id.bawbut).setOnClickListener { paymentMeth() }

        op1.setOnClickListener {
            val intent= Intent(this, benecoForm::class.java)
            startActivity(intent)
        }
        op2.setOnClickListener {
            val intent = Intent(this, bawadiForm::class.java)
            startActivity(intent)

        }
    }
    fun paymentMeth(){
        val intent = Intent(this, payment::class.java)
        startActivity(intent)
    }
}