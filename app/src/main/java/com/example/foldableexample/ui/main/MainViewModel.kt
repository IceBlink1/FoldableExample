package com.example.foldableexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var textViewLiveData: MutableLiveData<String> = MutableLiveData()

    fun postTextView(string: String) {
        textViewLiveData.postValue(string)
    }

}