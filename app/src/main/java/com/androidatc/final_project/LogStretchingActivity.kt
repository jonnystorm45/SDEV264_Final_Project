package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_strength.*
import kotlinx.android.synthetic.main.activity_logrun.*
import kotlinx.android.synthetic.main.activity_logrun.backBtm2
import kotlinx.android.synthetic.main.activity_logrun.ex1_1
import kotlinx.android.synthetic.main.activity_logrun.ex1_2

class LogStretchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_stretching)

        ex1.text=intent.getStringExtra("ex_1")
        ex2.text=intent.getStringExtra("ex_2")
        ex3.text=intent.getStringExtra("ex_3")
        ex4.text=intent.getStringExtra("ex_4")
        ex5.text=intent.getStringExtra("ex_5")
        ex6.text=intent.getStringExtra("ex_6")
        ex7.text=intent.getStringExtra("ex_7")
        ex8.text=intent.getStringExtra("ex_8")

        ex1_1.text=intent.getStringExtra("ex_1_1")
        ex2_1.text=intent.getStringExtra("ex_2_1")
        ex3_1.text=intent.getStringExtra("ex_3_1")
        ex4_1.text=intent.getStringExtra("ex_4_1")
        ex5_1.text=intent.getStringExtra("ex_5_1")
        ex6_1.text=intent.getStringExtra("ex_6_1")
        ex7_1.text=intent.getStringExtra("ex_7_1")
        ex8_1.text=intent.getStringExtra("ex_8_1")

        ex1_2.text=intent.getStringExtra("ex_1_2")
        ex2_2.text=intent.getStringExtra("ex_2_2")
        ex3_2.text=intent.getStringExtra("ex_3_2")
        ex4_2.text=intent.getStringExtra("ex_4_2")
        ex5_2.text=intent.getStringExtra("ex_5_2")
        ex6_2.text=intent.getStringExtra("ex_6_2")
        ex7_2.text=intent.getStringExtra("ex_7_2")
        ex8_2.text=intent.getStringExtra("ex_8_2")

        ex1_3.text=intent.getStringExtra("ex_1_3")
        ex2_3.text=intent.getStringExtra("ex_2_3")
        ex3_3.text=intent.getStringExtra("ex_3_3")
        ex4_3.text=intent.getStringExtra("ex_4_3")
        ex5_3.text=intent.getStringExtra("ex_5_3")
        ex6_3.text=intent.getStringExtra("ex_6_3")
        ex7_3.text=intent.getStringExtra("ex_7_3")
        ex8_3.text=intent.getStringExtra("ex_8_3")

        backBtm2.setOnClickListener{
            var intent = Intent(this, SecondaryAct::class.java)
            startActivity(intent)
        }
    }
}