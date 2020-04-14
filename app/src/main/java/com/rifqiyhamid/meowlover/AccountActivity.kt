package com.rifqiyhamid.meowlover

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccountActivity : AppCompatActivity() {
    private lateinit var tampil_hasil : TextView
    private lateinit var btn_home : ImageView
    private lateinit var btn_eat : ImageView
    private lateinit var btn_cat : ImageView
    private lateinit var btn_account : ImageView

    private lateinit var twitter : ImageView
    private lateinit var fb : ImageView
    private lateinit var ig : ImageView
    private lateinit var yt : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        //nav bottom
        btn_home = findViewById(R.id.home_btn)
        btn_eat = findViewById(R.id.eat_btn)
        btn_cat = findViewById(R.id.cat_btn)
        btn_account = findViewById(R.id.account_btn)

        //share link
        twitter = findViewById(R.id.twitter)
        fb = findViewById(R.id.fb)
        ig = findViewById(R.id.ig)
        yt = findViewById(R.id.yt)
        //hasil findId
        tampil_hasil = findViewById(R.id.tampil_hasil)

        //hasil getextra
        tampil_hasil.setText(intent.getStringExtra("hasil"))

        //intent keluar app
        twitter.setOnClickListener{
            val url = "https://www.twitter.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        fb.setOnClickListener{
            val url = "https://www.facebook.com/rifki.aal"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        ig.setOnClickListener{
            val url = "https://www.instagram.com/rifqiyyyy"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        yt.setOnClickListener{
            val url = "https://www.youtube.com/channel/UCmXrRYxMGFK4T3pP8v4nA3g"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        //pindah halaman

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
