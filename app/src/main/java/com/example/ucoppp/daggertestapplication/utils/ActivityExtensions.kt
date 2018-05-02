package com.example.ucoppp.daggertestapplication.utils

import com.example.ucoppp.daggertestapplication.MainActivity
import com.example.ucoppp.daggertestapplication.application.DaggerTestApplication

fun MainActivity.injectDagger() {
    (application as DaggerTestApplication)
            .appComponent
            .inject(this)
}