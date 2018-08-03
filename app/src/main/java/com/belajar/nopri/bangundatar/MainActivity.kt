package com.belajar.nopri.bangundatar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.belajar.nopri.bangundatar.home.HomePresenter
import com.belajar.nopri.bangundatar.home.HomeView
import com.belajar.nopri.bangundatar.model.PersegiPanjangKeliling
import com.belajar.nopri.bangundatar.model.PersegiPanjangLuas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HomeView {

    override fun getResultKeliling(persegiPanjang: PersegiPanjangKeliling) {
        Toast.makeText(this, "Hasil Keliling = ${persegiPanjang.keliling}", Toast.LENGTH_SHORT).show()
    }

    override fun getResultLuas(persegiPanjang: PersegiPanjangLuas) {
        Toast.makeText(this, "Hasil Luas = ${persegiPanjang.luas}", Toast.LENGTH_SHORT).show()
    }

    lateinit var presenter: HomePresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = HomePresenter(this)
        bt_hitung.setOnClickListener { hitung() }
    }

    private fun hitung() {
        val lbr = txt_lebar.text.toString().toDouble()
        val panjang = txt_panjang.text.toString().toDouble()
        if (rb_keliling.isChecked) {
            presenter.hitungKeliling(panjang, lbr)
            Log.d("Hitung", "Keliling")
        } else {
            presenter.hitungLuas(panjang, lbr)
            Log.d("Hitung", "Luas")
        }
    }
}
