package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardio.*
import kotlinx.android.synthetic.main.activity_preference.*


class CardioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardio)
        logId.setOnClickListener{
            var intent = Intent(this,LogRunActivity::class.java)
            intent.putExtra("Type", cardioType2.text.toString())
            intent.putExtra("Time", timeId2.text.toString())
            intent.putExtra("Distance", distanceId2.text.toString())

            startActivity(intent)
        }
    }
}