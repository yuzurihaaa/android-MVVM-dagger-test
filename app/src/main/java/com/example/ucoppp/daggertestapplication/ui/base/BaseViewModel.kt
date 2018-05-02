package com.example.ucoppp.daggertestapplication.ui.base

import android.app.Activity
import android.support.v4.app.Fragment


abstract class BaseViewModel {


    private lateinit var activity: Activity
    private lateinit var fragment: Fragment

    constructor(activity: Activity){
        this.activity = activity
    }

    constructor(fragment: Fragment){
        this.fragment = fragment
    }

}