package com.example.tugasopsional

import android.os.Parcel
import android.os.Parcelable

data class Obesitas(val berat: Int, val tinggi : Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(berat)
        parcel.writeInt(tinggi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Obesitas> {
        override fun createFromParcel(parcel: Parcel): Obesitas {
            return Obesitas(parcel)
        }

        override fun newArray(size: Int): Array<Obesitas?> {
            return arrayOfNulls(size)
        }
    }
}
