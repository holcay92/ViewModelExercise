package com.example.viewmodelexercise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
     val userName = MutableLiveData<String>()
    init {
        userName.value = "Halil Olcay"
    }


}