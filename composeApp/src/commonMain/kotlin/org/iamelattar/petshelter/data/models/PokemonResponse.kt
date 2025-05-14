package org.iamelattar.petshelter.data.models

import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    val count: Long,
    val prev: String?,
    val next: String?,
    val results: List<Pokemon> = listOf()
)
