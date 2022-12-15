package com.example.tectfletx.features.vehicles.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.Error
import com.example.domain.entities.ResponseVehicleDomain
import com.example.usecases.GetVehiclesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class VehiclesViewModel @Inject constructor(
    private val getVehiclesUseCase: GetVehiclesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(UIState())
    val state: StateFlow<UIState> get() = _state.asStateFlow()


    fun getVehicles() = viewModelScope.launch {
        setLoading(true)
        getVehiclesUseCase.invoke().fold(
            ifLeft = {
                setLoading(false)
                setError(it)
            },
            ifRight = {response ->
                setLoading(false)
                _state.update { it.copy(responseVehicles = response) }
            }
        )
    }

    private fun setLoading(boolean: Boolean) {
        _state.update { UIState(loading = boolean) }
    }


    private fun setError(errorServer: Error) {
        _state.update { it.copy(loading = false, error = errorServer) }
    }



    data class UIState(
        val error: Error? = null,
        val loading: Boolean = false,
        val responseVehicles: ResponseVehicleDomain? = null,
    )

}