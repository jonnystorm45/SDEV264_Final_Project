package com.androidatc.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        createAct.setOnClickListener{
            var intent = Intent(this,PreferenceActivity::class.java)
            startActivity(intent)
        }
        helpBtn.setOnClickListener{
            var intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }

        loginBtn.setOnClickListener{
            if (username.text.trim().toString().isNotEmpty()||
                    password.text.trim().toString().isNotEmpty()){
                login(username.text.trim().toString(), password.text.trim().toString())
            }
            else {
                Snackbar.make(findViewById(R.id.loginBtn),
                "Check your Username or Password and try again!",
                Snackbar.LENGTH_LONG).show()
            }
        }
    }
    fun login(email: String, password: String){

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task->
                if (task.isSuccessful){
                    startActivity(Intent(this, SecondaryAct::class.java))
                }
                else{
                    Snackbar.make(
                        findViewById(R.id.loginBtn),
                        "Enter a valid username or password",
                        Snackbar.LENGTH_LONG).show()
                }
            }
    }
}
