package dev.ahmedmourad.nocopy.sample

import kotlinx.serialization.Serializable

fun main() {
    println(PhoneNumber("0111111"))
}

@Serializable
data class PhoneNumber(
        val value: String
)
