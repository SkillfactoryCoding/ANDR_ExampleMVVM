package com.devsoldatenkov.examplemvvm

import android.app.Application
import com.devsoldatenkov.examplemvvm.data.Repo
import com.devsoldatenkov.examplemvvm.domain.Interactor

class App : Application() {
    lateinit var interactor: Interactor

    override fun onCreate() {
        super.onCreate()
        instance = this
        interactor = Interactor(Repo())
    }

    companion object {
        lateinit var instance: App
            private set
    }
}