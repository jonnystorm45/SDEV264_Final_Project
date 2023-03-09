package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_personal.*

class PersonalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal)

        readFireStoreData()
    }

    fun readFireStoreData(){

        val db = FirebaseFirestore.getInstance()

        db.collection("User")
            .get()
            .addOnCompleteListener{
                val result:StringBuffer = StringBuffer()
                val result1:StringBuffer = StringBuffer()
                val result2:StringBuffer = StringBuffer()
                val result3:StringBuffer = StringBuffer()
                if (it.isSuccessful){
                    for (document in it.result!!){
                        result.append(document.data.getValue("Goals"))
                        result1.append(document.data.getValue("Training"))
                        result2.append(document.data.getValue("Time"))
                        result3.append(document.data.getValue("Weight Goals"))
                    }
                    goalsId3.text = result
                    trainingId2.text = result1
                    time3.text = result2
                    goal3.text = result3


                }
            }

        backBtn.setOnClickListener{
            var intent = Intent(this, SecondaryAct::class.java)
            startActivity(intent)
        }
        logoutId.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            Firebase.auth.signOut()
            startActivity(intent)
        }

    }
}