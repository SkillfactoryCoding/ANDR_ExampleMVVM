package com.devsoldatenkov.examplemvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import com.devsoldatenkov.examplemvvm.R
import com.devsoldatenkov.examplemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mainActivityViewModel: MainActivityViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(MainActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityViewModel.liveData.observe(this) {
            binding.text.text = it.toString()
        }

        binding.button.setOnClickListener {
            mainActivityViewModel.getData()
        }
    }
}