package org.iamelattar.petshelter.data.utils


sealed class ResultWrapper<T>(
    val data: T? = null,
    val error: String? = null,
    val loading: Boolean = false
) {
    class Success<T>(data: T?) : ResultWrapper<T>(data)
    class Error<T>(msg: String) : ResultWrapper<T>(error = msg)
    class Loading<T>(loading: Boolean) : ResultWrapper<T>(loading = loading)
}
