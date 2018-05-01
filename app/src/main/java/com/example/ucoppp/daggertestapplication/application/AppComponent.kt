package com.example.ucoppp.daggertestapplication.application

import com.example.ucoppp.daggertestapplication.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(daggerTestApplication: DaggerTestApplication)
}