package com.example.myapplication.com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.com.example.myapplication.data.model.Disney
import com.example.myapplication.com.example.myapplication.data.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DisneyViewModel: ViewModel() {

    private val _disney = MutableStateFlow<List<Disney>>(emptyList())

    val disney: StateFlow<List<Disney>> = _disney

    init {
        fetchDisney()
    }

    private fun fetchDisney() {

        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getDisney()

                _disney.value = response
            } catch(e: Exception) {
                e.printStackTrace()
            }
        }
    }
}