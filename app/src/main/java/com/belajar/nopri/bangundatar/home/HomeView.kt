package com.belajar.nopri.bangundatar.home

import com.belajar.nopri.bangundatar.model.PersegiPanjangKeliling
import com.belajar.nopri.bangundatar.model.PersegiPanjangLuas

interface HomeView {
    fun getResultLuas(persegiPanjang: PersegiPanjangLuas)
    fun getResultKeliling(persegiPanjang: PersegiPanjangKeliling)
}