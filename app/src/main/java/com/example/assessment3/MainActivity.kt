package com.example.assessment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    lateinit var tilusername:TextInputLayout
    lateinit var tilphonenumber:TextInputLayout
    lateinit var tilEmailAddress:TextInputLayout
    lateinit var tilpassword:TextInputLayout
    lateinit var button:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        buttonlogin.setOnClickListner
}