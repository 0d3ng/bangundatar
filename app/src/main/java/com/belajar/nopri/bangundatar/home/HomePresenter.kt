package com.belajar.nopri.bangundatar.home

import com.belajar.nopri.bangundatar.model.PersegiPanjangKeliling
import com.belajar.nopri.bangundatar.model.PersegiPanjangLuas


class HomePresenter(private val homeView: HomeView) {
    private fun luas(panjang: Double, lebar: Double): Double {
        return panjang * lebar
    }

    private fun kelling(panjang: Double, lebar: Double): Double {
        return 2 * (panjang + lebar)
    }

    fun hitungLuas(panjang: Double, lebar: Double) {
        val a = luas(panjang, lebar)
        val pp = PersegiPanjangLuas(a)
        homeView.getResultLuas(pp)
    }

    fun hitungKeliling(panjang: Double, lebar: Double) {
        val b = kelling(panjang, lebar)
        val keliling = PersegiPanjangKeliling(b)
        homeView.getResultKeliling(keliling)
    }
}