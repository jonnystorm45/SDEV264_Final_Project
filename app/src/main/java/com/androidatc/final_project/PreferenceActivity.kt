package com.androidatc.final_project

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.auth.User
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_preference.*

class PreferenceActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        auth = FirebaseAuth.getInstance()
        buttonSave.setOnClickListener() {
            if (userNameId.text.trim().toString().isNotEmpty()
                ||passwordId2.text.trim().toString().isNotEmpty()){
                createUser(userNameId.text.trim().toString(),
                passwordId2.text.trim().toString())

                newUser()
            }
            else {
                Snackbar.make(findViewById(R.id.buttonSave),
                "Make sure all fields are filled out and then try again!",
                Snackbar.LENGTH_LONG).show()
            }
        }
    }

    fun createUser(email: String, password: String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful){
                    startActivity(Intent(this, MainActivity::class.java))
                }
                else {
                    Snackbar.make(
                        findViewById(R.id.buttonSave),
                        "Enter a valid username and password!",
                    Snackbar.LENGTH_LONG).show()

                }
            }
    }
    private fun newUser(){
        val user = hashMapOf(
            "Goals" to goalsId2.text.toString().trim(),
            "Training" to trainingId.text.toString().trim(),
            "Time" to time2.text.toString().trim(),
            "Weight Goals" to goal2.text.toString().trim()
        )
        db.collection("User")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "Document Snapshot added with ID: ${documentReference.id} ")
            }
            .addOnFailureListener{e->
                Log.w(TAG, "Error adding document", e)
            }
    }
}