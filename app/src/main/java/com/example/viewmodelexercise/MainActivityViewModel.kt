package com.example.viewmodelexercise

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal:Int): ViewModel() {
    private var count = 0
    private var total = 0
    init {
        total = startingTotal
    }
    fun add(number: Int): Int {
        total += number
        return total
    }
    fun getResult(): Int {
        return total
    }
    fun getCount(): Int {
        return count
    }
    fun getUpdatedCount(): Int {
        return ++count
    }

}