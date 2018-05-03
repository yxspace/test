package com.example.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MyTestLibClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)








        val asfd = MyTestLibClass()
    }
}
