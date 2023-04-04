package com.example.viewmodelexercise

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var count = 0
    fun getCount(): Int {
        return count
    }
    fun setCount(count: Int) {
        this.count = count
    }

}