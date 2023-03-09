package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logrun.*

class LogRunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logrun)
        cardioType.text=intent.getStringExtra("Type")
        ex1_1.text=intent.getStringExtra("Time")
        ex1_2.text=intent.getStringExtra("Distance")

        backBtm2.setOnClickListener{
            var intent = Intent(this, SecondaryAct::class.java)
            startActivity(intent)
        }
    }
}