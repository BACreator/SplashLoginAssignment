package com.example.splashloginassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LogIn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        //getActionBar()?.hide();

        val signIn = findViewById<Button>(R.id.button)

        val email = findViewById<EditText>(R.id.userName)
        val password = findViewById<EditText>(R.id.Password)

        signIn.setOnClickListener {
            Toast.makeText(this,"Sign In button is clicked",Toast.LENGTH_SHORT).show()
            email.text.clear();
            password.text.clear();

        }
    }
}