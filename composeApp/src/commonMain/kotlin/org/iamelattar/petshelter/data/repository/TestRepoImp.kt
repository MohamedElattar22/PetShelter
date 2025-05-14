package org.iamelattar.petshelter.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.iamelattar.petshelter.data.api.WebService
import org.iamelattar.petshelter.data.datasource.RemoteDS
import org.iamelattar.petshelter.data.models.PokemonResponse
import org.iamelattar.petshelter.data.utils.ResultWrapper

class TestRepoImp(
    private val webService: WebService
) : TestRepo {
    override suspend fun getPokemonList(): Flow<ResultWrapper<PokemonResponse>> {
        return flow {
            emit(ResultWrapper.Loading(true))
            emit(webService.getPokemonList())
        }
    }

}