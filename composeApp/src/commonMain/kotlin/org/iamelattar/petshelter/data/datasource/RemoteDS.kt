package org.iamelattar.petshelter.data.datasource

import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.request.url
import org.iamelattar.petshelter.data.api.WebService
import org.iamelattar.petshelter.data.models.PokemonResponse
import org.iamelattar.petshelter.data.utils.ResultWrapper
import org.iamelattar.petshelter.expects.client

class RemoteDS : WebService {
    override suspend fun getPokemonList(): ResultWrapper<PokemonResponse> {
        try {
            val response = client.get {
                url("pokemon")
            }
            return ResultWrapper.Success(response.body())

        } catch (e: RedirectResponseException) {
            return (ResultWrapper.Error(e.response.status.description))

        } catch (e: ClientRequestException) {
            return (ResultWrapper.Error(e.response.status.description))
        } catch (e: ServerResponseException) {
            return (ResultWrapper.Error(e.response.status.description))
        } catch (e: Exception) {
            return (ResultWrapper.Error(e.message ?: "Something went wrong"))
        }
    }


}