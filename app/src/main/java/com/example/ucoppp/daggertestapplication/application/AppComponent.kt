package com.example.ucoppp.daggertestapplication.application

import com.example.ucoppp.daggertestapplication.MainActivity
import com.example.ucoppp.daggertestapplication.ui.signin.SignInActivity
import com.example.ucoppp.daggertestapplication.ui.signin.SignInModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, SignInModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(daggerTestApplication: DaggerTestApplication)

    fun inject(signInActivity: SignInActivity)
}