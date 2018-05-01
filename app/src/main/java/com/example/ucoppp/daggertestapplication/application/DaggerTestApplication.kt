package com.example.ucoppp.daggertestapplication.application

import android.app.Application

class DaggerTestApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

    }
}