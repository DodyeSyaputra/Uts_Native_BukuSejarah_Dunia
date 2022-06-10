package com.example.uts_native_bukusejarah_dunia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail_buku_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buku)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val buku = intent.getParcelableExtra<buku>(MainActivity.INTENT_PARCELABLE)

        val imgbuku = findViewById<ImageView>(R.id.img_item_photo)
        val namebuku = findViewById<TextView>(R.id.tv_item_name)
        val descbuku = findViewById<TextView>(R.id.tv_item_description)

        imgbuku.setImageResource(buku?.imgbuku!!)
        namebuku.text = buku.namebuku
        descbuku.text = buku.descbuku
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}