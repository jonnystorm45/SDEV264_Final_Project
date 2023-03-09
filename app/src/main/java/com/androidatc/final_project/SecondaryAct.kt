package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        cardio.setOnClickListener{
            var intent = Intent(this,CardioActivity::class.java)
            startActivity(intent)
        }
        strength.setOnClickListener{
            var intent = Intent(this,WorkoutActivity::class.java)
            startActivity(intent)
        }
        stretch.setOnClickListener{
            var intent = Intent(this,StretchingActivity::class.java)
            startActivity(intent)
        }
        personalId.setOnClickListener{
            var intent = Intent(this,PersonalActivity::class.java)
            startActivity(intent)
        }
    }
}