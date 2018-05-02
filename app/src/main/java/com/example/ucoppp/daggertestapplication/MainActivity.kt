package com.example.ucoppp.daggertestapplication

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.ucoppp.daggertestapplication.ui.signin.SignInActivity
import com.example.ucoppp.daggertestapplication.utils.injectDagger
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH: Long = 1000

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDagger()

        sharedPreferences.edit()?.putInt("TEST", 10)?.apply()

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}
