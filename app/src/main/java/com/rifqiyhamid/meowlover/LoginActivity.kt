package com.rifqiyhamid.meowlover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var input_email : EditText
    private lateinit var input_password : EditText
    private lateinit var btn_login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        input_email = findViewById(R.id.input_email)
        input_password = findViewById(R.id.input_password)
        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email", input_email.text.toString())
            startActivity(intent)
        }
    }
}
