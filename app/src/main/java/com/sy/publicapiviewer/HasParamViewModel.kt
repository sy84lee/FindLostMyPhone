package com.sy.publicapiviewer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HasParamViewModelFactory(private val repository: FindPhoneRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(FindPhoneViewModel::class.java)) {
            FindPhoneViewModel(repository) as T
        } else {
            throw IllegalArgumentException()
        }
    }
}