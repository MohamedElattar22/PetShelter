package org.iamelattar.petshelter.expects

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

actual val client: HttpClient
    get() = HttpClient(OkHttp) {
        install(HttpTimeout) {
            socketTimeoutMillis = 15_000
            connectTimeoutMillis = 15_000
            requestTimeoutMillis = 15_000
        }
        defaultRequest {
            header("Content-Type", "application/json")
            url("https://pokeapi.co/api/v2/")
        }
        install(ContentNegotiation) {
            json(
                Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                    explicitNulls = false
                }
            )
        }
    }