package com.example.tugasopsional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val hitungberat = intent.getParcelableExtra<Obesitas>("HITUNG") as Obesitas
        val hasilhitung = hitungberat.berat/hitungberat.tinggi
        val keterangan = if (hasilhitung < 18.5){
            "Kurus"
        } else if(hasilhitung >18.5 && hasilhitung <24.9){
            "Normal"
        }else if (hasilhitung >25 && hasilhitung <29.9){
            "Overweight"
        }else{
            "Obesitas"
        }

        text_bb.setText("Berat badan : ${hitungberat.berat}")
        text_tinggi.setText("Tinggi badan : ${hitungberat.tinggi}")
        text_hasil.setText("Hasil : $hasilhitung, $keterangan")
    }
}