package org.iamelattar.petshelter.presentation.home

sealed class PokeUiEvent {
    data object GetPokemonList: PokeUiEvent()
}