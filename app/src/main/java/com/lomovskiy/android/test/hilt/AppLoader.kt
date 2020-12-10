package com.lomovskiy.android.test.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppLoader : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
