package org.iamelattar.petshelter.data.utils

sealed class ResultWrapper<out T>{
    data class Success<out T>(val data : T):ResultWrapper<T>()
    data class Error(val exception: String):ResultWrapper<Nothing>()
}