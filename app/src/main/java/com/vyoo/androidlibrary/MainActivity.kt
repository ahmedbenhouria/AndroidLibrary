package com.vyoo.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vyoo.androidlibrary.databinding.ActivityMainBinding
import com.vyoo.mylibrary.SetMarginView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        SetMarginView.setMargins(binding.appNameText,this,20,150,0,50)
    }

}