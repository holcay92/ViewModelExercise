package com.example.viewmodelexercise

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var count = 0
    private var result = 0
    fun add(number: Int): Int {
        result += number
        return result
    }
    fun getResult(): Int {
        return result
    }
    fun getCount(): Int {
        return count
    }
    fun getUpdatedCount(): Int {
        return ++count
    }

}