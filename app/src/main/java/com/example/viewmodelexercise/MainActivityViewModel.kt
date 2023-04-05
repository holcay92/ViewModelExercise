package com.example.viewmodelexercise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal:Int): ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total
    init {
        total.value = startingTotal
    }
    fun setTotal(input:Int){
        total.value = (total.value)?.plus(input)
    }
// -----------------------------------------------------------------------------
    // example 2
    private val count = MutableLiveData<Int>()
    val countData : LiveData<Int>
        get() = count
    init {
        count.value = 0
    }
    fun setCount(){
        count.value = (count.value)?.plus(1)
    }

}