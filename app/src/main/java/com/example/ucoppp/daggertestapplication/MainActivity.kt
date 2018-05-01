package com.example.ucoppp.daggertestapplication

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ucoppp.daggertestapplication.application.DaggerTestApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DaggerTestApplication)
                .appComponent
                .inject(this)

        sharedPreferences.edit()?.putInt("TEST", 10)?.apply()

        Log.e("sp value", "sp value is ${sharedPreferences.getInt("TEST", 0)}")
    }
}
