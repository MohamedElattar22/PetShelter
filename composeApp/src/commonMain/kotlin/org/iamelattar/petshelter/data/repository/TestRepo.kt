package org.iamelattar.petshelter.data.repository

import kotlinx.coroutines.flow.Flow
import org.iamelattar.petshelter.data.models.PokemonResponse
import org.iamelattar.petshelter.data.utils.ResultWrapper

interface TestRepo {
    suspend fun getPokemonList () : Flow<ResultWrapper<PokemonResponse>>
}