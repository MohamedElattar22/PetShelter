package org.iamelattar.petshelter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun getMyFullName(): Platform