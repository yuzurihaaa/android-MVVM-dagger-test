package com.example.ucoppp.daggertestapplication.ui.signin

import android.content.SharedPreferences
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.util.Log
import com.example.ucoppp.daggertestapplication.R
import com.example.ucoppp.daggertestapplication.application.DaggerTestApplication
import com.example.ucoppp.daggertestapplication.databinding.ActivitySignInBinding
import com.example.ucoppp.daggertestapplication.ui.base.BaseActivity
import javax.inject.Inject

class SignInActivity : BaseActivity() {

    @Inject
    lateinit var signInActivityViewModel: SignInActivityViewModel

    private val activitySignInBinding: ActivitySignInBinding by lazy {
        DataBindingUtil.setContentView<ActivitySignInBinding>(this, R.layout.activity_sign_in)
    }

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as DaggerTestApplication)
                .appComponent
                .inject(this)

        activitySignInBinding.viewModel = signInActivityViewModel

        Log.e("sp value", "sp value is ${sharedPreferences.getInt("TEST", 0)}")

    }
}