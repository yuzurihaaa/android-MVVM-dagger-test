package com.example.ucoppp.daggertestapplication.application

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val application: DaggerTestApplication) {

    @Provides @Singleton
    fun provideApplicationContext() : Context = application

    @Provides @Singleton
    fun provideSharedPreference(context: Context) : SharedPreferences =
            context.getSharedPreferences("My_prefs_title", Context.MODE_PRIVATE)

}