package org.iamelattar.petshelter.presentation.home

import org.iamelattar.petshelter.data.models.Pokemon

data class PokeListUiState(
    var data: List<Pokemon> = emptyList(),
    var error: String = "",
    var loading: Boolean = false
)