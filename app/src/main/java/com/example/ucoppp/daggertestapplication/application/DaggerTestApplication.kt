package com.example.ucoppp.daggertestapplication.application

import android.app.Activity
import android.app.Application
import com.example.ucoppp.daggertestapplication.ui.signin.SignInActivity
import com.example.ucoppp.daggertestapplication.ui.signin.SignInModule
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector

class DaggerTestApplication : Application(), HasActivityInjector {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .signInModule(SignInModule(SignInActivity()))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}