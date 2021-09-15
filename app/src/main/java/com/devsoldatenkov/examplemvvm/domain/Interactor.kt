package com.devsoldatenkov.examplemvvm.domain

import com.devsoldatenkov.examplemvvm.data.Repo

class Interactor(private val repo: Repo) {
    fun getList(): List<String> = repo.nameList
}