package org.iamelattar.petshelter.data.api

import org.iamelattar.petshelter.data.models.PokemonResponse
import org.iamelattar.petshelter.data.utils.ResultWrapper

interface WebService {
    suspend fun getPokemonList(): ResultWrapper<PokemonResponse>
}