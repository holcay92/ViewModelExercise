package com.example.viewmodelexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexercise.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        viewModel.totalData.observe(this, Observer {
            binding.tvResult.text = it.toString()
        })
        viewModel.countData.observe(this, Observer {
            binding.tvResult2.text = it.toString()
        })

        binding.btnAdd.setOnClickListener {
            if(binding.etInput.text.toString().isNotEmpty()){
                viewModel.setTotal(binding.etInput.text.toString().toInt())
            }
            else{
                viewModel.setTotal(0)
            }
        }
        binding.btnAdd2.setOnClickListener {
            viewModel.setCount()
        }

    }
}