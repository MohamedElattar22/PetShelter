package org.iamelattar.petshelter.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(
    val name : String,
    val url : String
)
