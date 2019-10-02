package com.lmy.typeface

import android.app.Application
import com.lmy.library.typeface.TypeFaceApplication

/**
 * Create by 2019/10/2
 * Author lmy
 */
class AppAp: Application() {
    override fun onCreate() {
        super.onCreate()
        TypeFaceApplication.init()
    }
}