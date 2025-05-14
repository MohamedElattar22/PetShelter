package org.iamelattar.petshelter.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.iamelattar.petshelter.data.repository.TestRepo
import org.iamelattar.petshelter.data.utils.ResultWrapper

class HomeViewModel(
    private val repo : TestRepo
) : ViewModel() {

    private val _state : MutableStateFlow<PokeListUiState> = MutableStateFlow(PokeListUiState())
    val state get() =  _state.asStateFlow()

    init {
        onEvent(PokeUiEvent.GetPokemonList)
    }

    private fun onEvent(event: PokeUiEvent){
        when(event){
            is PokeUiEvent.GetPokemonList->{
                getPokemonList()
            }
        }
    }

    private fun getPokemonList() {
        viewModelScope.launch {
            repo.getPokemonList().collect{ result->
                when(result){
                    is ResultWrapper.Error -> {
                        _state.update {
                            it.copy(
                                loading = false,
                                error = result.error?:"Something went wrong"
                            )
                        }
                    }

                    is ResultWrapper.Success<*> -> {
                        _state.update {
                            it.copy(
                                loading = false,
                                data = result.data?.results?: emptyList(),
                                error = ""
                            )
                        }

                    }

                    is ResultWrapper.Loading<*> -> {
                        _state.update {
                            it.copy(
                                loading = true
                            )
                        }
                    }
                }

            }
        }
    }

}