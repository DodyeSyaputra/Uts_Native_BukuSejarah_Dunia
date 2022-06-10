package com.example.uts_native_bukusejarah_dunia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BukuList = listOf<buku>(
            buku(
                R.drawable.china,
                "China",
                " Tuntutlah ilmu sampai ke negeri Cina, siapa tahu bisa kecipratan sukses! "
            ),
            buku(
                R.drawable.the_earth,
                "The Earth",
                " Tentang bumi dan penghuninya"
            ),
            buku(
                R.drawable.ensiklopedia,
                "Ensiklopedia Sejarah Dunia",
                " Buku sejarah dunia untuk anak, visualisasinya bikin mata tak bergeming "
            ),
            buku(
                R.drawable.sejarah_teh,
                "A History of Tea ",
                " Buku saku untuk tea lovers! "
            ),
            buku(
                R.drawable.isme,
                "Isme Isme yang Mengguncang Dunia",
                " Belajar dari mereka yang hidup di tengah perang ideologi "
            ),
            buku(
                R.drawable.until,
                "The World until Yesterday",
                " Butuh setengah abad untuk melahirkan tulisan ini! "
            ),
            buku(
                R.drawable.sapiens,
                "Sapiens",
                " Menjadi bacaan pendiri Facebook dan Microsoft! "
            ),
            buku(
                R.drawable.history,
                "Historty Of The World Map by Map",
                " Berisi 140 custom map yang menjabarkan berbagai timeline penting "
            ),
            buku(
                R.drawable.sejarah_dunia,
                "Sejarah Dunia yang Disembunyikan",
                " Buku kontroversial yang versi PDF-nya banyak dicari di Google Search! "
            ),
            buku(
                R.drawable.sejarah,
                "World History",
                " Buku sejarah dunia lengkap yang sudah terbit sejak tahun 1921 "
            ),


            )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_buku)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BukuAdapter(this, BukuList){
            val intent = Intent(this,Detail_buku_Activity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}