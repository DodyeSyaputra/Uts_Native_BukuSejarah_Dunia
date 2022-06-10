package com.example.uts_native_bukusejarah_dunia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class BukuAdapter (private val context: Context, private val buku: List<buku>, val listener: (buku) ->Unit)
    : RecyclerView.Adapter<BukuAdapter.BukuViewHolder>(){

    class BukuViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgbuku = view.findViewById<ImageView>(R.id.img_item_photo)
        val namebuku = view.findViewById<TextView>(R.id.tv_item_name)
        val descbuku = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(makanan: buku, listener: (buku) -> Unit) {
            imgbuku.setImageResource(makanan.imgbuku)
            namebuku.text = makanan.namebuku
            descbuku.text = makanan.descbuku
            itemView.setOnClickListener{listener(makanan)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        return BukuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_buku,parent, false)
        )
    }

    override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
        holder.bindView(buku[position], listener)
    }

    override fun getItemCount(): Int = buku.size
}