package com.rifqiyhamid.meowlover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var tampil_email : TextView
    private lateinit var btn_home : ImageView
    private lateinit var btn_eat : ImageView
    private lateinit var btn_cat : ImageView
    private lateinit var btn_account : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tampil_email = findViewById(R.id.tampil_email)
        btn_home = findViewById(R.id.home_btn)
        btn_eat = findViewById(R.id.eat_btn)
        btn_cat = findViewById(R.id.cat_btn)
        btn_account = findViewById(R.id.account_btn)

        tampil_email.setText(intent.getStringExtra("email"))

        btn_home.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }

        btn_eat.setOnClickListener{
            startActivity(Intent(this,EatActivity::class.java))
        }

        btn_cat.setOnClickListener{
            startActivity(Intent(this,CatActivity::class.java))
        }

        btn_account.setOnClickListener{
            startActivity(Intent(this,AccountActivity::class.java))
        }



    }
}
