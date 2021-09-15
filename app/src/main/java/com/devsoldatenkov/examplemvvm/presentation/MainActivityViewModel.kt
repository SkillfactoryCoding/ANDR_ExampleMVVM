package com.devsoldatenkov.examplemvvm.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.devsoldatenkov.examplemvvm.App

class MainActivityViewModel : ViewModel() {
    private val interactor = App.instance.interactor
    private val _liveData = MediatorLiveData<List<String>>()
    val liveData: LiveData<List<String>>
        get() = _liveData

    fun getData() {
        _liveData.postValue(interactor.getList())
    }
}