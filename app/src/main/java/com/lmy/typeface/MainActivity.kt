package com.lmy.typeface

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    override fun attachBaseContext(newBase: Context) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
//    }
}
