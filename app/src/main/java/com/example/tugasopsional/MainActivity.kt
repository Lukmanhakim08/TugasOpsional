package com.example.tugasopsional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hitungberatbadan()
    }

    fun hitungberatbadan(){
        btn_proses.setOnClickListener {
            val bb = edt_bb.text.toString().toInt()
            val lb = edt_tinggi.text.toString().toInt()
            val pindah = Intent(this, HasilActivity::class.java)
            val hitung = Obesitas(bb, lb)
            pindah.putExtra("HITUNG", hitung)
            startActivity(pindah)
        }
    }
}