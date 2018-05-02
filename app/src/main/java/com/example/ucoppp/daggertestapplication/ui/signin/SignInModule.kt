package com.example.ucoppp.daggertestapplication.ui.signin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SignInModule(private val signInActivity: SignInActivity) {

    @Provides
    @Singleton
    fun getSignInActivity(): SignInActivity = signInActivity

    @Provides
    @Singleton
    fun provideViewModel(): SignInActivityViewModel {
        return SignInActivityViewModel(signInActivity)
    }

}