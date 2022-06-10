package com.example.uts_native_bukusejarah_dunia

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class buku(
    val imgbuku: Int,
    val namebuku: String,
    val descbuku: String
) : Parcelable
