package com.example.viewmodelexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexercise.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.tvCount.text = viewModel.getCount().toString()
        binding.tvResult.text = viewModel.getResult().toString()

        binding.btnCount.setOnClickListener {
            binding.tvCount.text = viewModel.getUpdatedCount().toString()
        }
        binding.btnAdd.setOnClickListener {
            binding.tvResult.text = viewModel.add(binding.etInput.text.toString().toInt()).toString()
        }


    }
}