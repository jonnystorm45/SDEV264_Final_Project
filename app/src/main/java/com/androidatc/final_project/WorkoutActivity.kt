package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_workout.*

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        LogId.setOnClickListener{
            var intent = Intent(this,LogStrengthActivity::class.java)
            intent.putExtra("ex_1", exercise_1.text.toString())
            intent.putExtra("ex_2", exercise_2.text.toString())
            intent.putExtra("ex_3", exercise_3.text.toString())
            intent.putExtra("ex_4", exercise_4.text.toString())
            intent.putExtra("ex_5", exercise_5.text.toString())
            intent.putExtra("ex_6", exercise_6.text.toString())
            intent.putExtra("ex_7", exercise_7.text.toString())
            intent.putExtra("ex_8", exercise_8.text.toString())

            intent.putExtra("ex_1_1", exercise_1_1.text.toString())
            intent.putExtra("ex_2_1", exercise_2_1.text.toString())
            intent.putExtra("ex_3_1", exercise_3_1.text.toString())
            intent.putExtra("ex_4_1", exercise_4_1.text.toString())
            intent.putExtra("ex_5_1", exercise_5_1.text.toString())
            intent.putExtra("ex_6_1", exercise_6_1.text.toString())
            intent.putExtra("ex_7_1", exercise_7_1.text.toString())
            intent.putExtra("ex_8_1", exercise_8_1.text.toString())

            intent.putExtra("ex_1_2", exercise_1_2.text.toString())
            intent.putExtra("ex_2_2", exercise_2_2.text.toString())
            intent.putExtra("ex_3_2", exercise_3_2.text.toString())
            intent.putExtra("ex_4_2", exercise_4_2.text.toString())
            intent.putExtra("ex_5_2", exercise_5_2.text.toString())
            intent.putExtra("ex_6_2", exercise_6_2.text.toString())
            intent.putExtra("ex_7_2", exercise_7_2.text.toString())
            intent.putExtra("ex_8_2", exercise_8_2.text.toString())

            intent.putExtra("ex_1_3", exercise_1_3.text.toString())
            intent.putExtra("ex_2_3", exercise_2_3.text.toString())
            intent.putExtra("ex_3_3", exercise_3_3.text.toString())
            intent.putExtra("ex_4_3", exercise_4_3.text.toString())
            intent.putExtra("ex_5_3", exercise_5_3.text.toString())
            intent.putExtra("ex_6_3", exercise_6_3.text.toString())
            intent.putExtra("ex_7_3", exercise_7_3.text.toString())
            intent.putExtra("ex_8_3", exercise_8_3.text.toString())

            startActivity(intent)
        }
    }
}