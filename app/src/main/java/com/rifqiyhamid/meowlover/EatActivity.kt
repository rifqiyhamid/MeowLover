package com.rifqiyhamid.meowlover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class EatActivity : AppCompatActivity() {
    private lateinit var input_number1: EditText
    private lateinit var input_number2: EditText
    private lateinit var btn_hitung: Button
    private lateinit var btn_home : ImageView
    private lateinit var btn_eat : ImageView
    private lateinit var btn_cat : ImageView
    private lateinit var btn_account : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eat)
        //halaman nav
        btn_home = findViewById(R.id.home_btn)
        btn_eat = findViewById(R.id.eat_btn)
        btn_cat = findViewById(R.id.cat_btn)
        btn_account = findViewById(R.id.account_btn)
        // perhitungan
        input_number1 = findViewById(R.id.input_number1)
        input_number2 = findViewById(R.id.input_number2)
        btn_hitung = findViewById(R.id.btn_hitung)


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

        //perhitungan

        btn_hitung.setOnClickListener{
            var input1 = input_number1.text.toString().trim().toBigDecimal()
            var input2 = input_number2.text.toString().trim().toBigDecimal()

            var hasil = input1.add(input2).toString()

            val hitung = Intent(this, AccountActivity::class.java)
           hitung.putExtra("hasil", hasil)
            startActivity(hitung)


        }
    }
}
