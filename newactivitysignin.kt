package com.example.bookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NewActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister: TextView
    val validMobileNumber = "0123456789"
    val validPassword =arrayOf("harry","poordad","richdad")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        title="Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)



        btnLogin.setOnClickListener{
            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()


           if((mobileNumber == validMobileNumber) && (validPassword.contains(password))){
               val intent = Intent(this@NewActivity,MainActivity::class.java)
               startActivity(intent)
           } else {
               Toast.makeText(this@NewActivity,"Incorrect Credentials",Toast.LENGTH_LONG).show()
           }


        }


    }
}
