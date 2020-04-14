package com.rifqiyhamid.meowlover

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login = findViewById(R.id.btn_login) as Button
        val btn_daftar = findViewById(R.id.btn_login) as Button

        btn_login.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java));
        }
    }
}
