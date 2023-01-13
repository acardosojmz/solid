package com.example.solid.exercise_2

import java.time.LocalDate

data class User(
    val fullName: String,
    val address: Address,
    val country: String,
    val account: String,
    val password: String,
    val genre: String,
    val registrationDate: LocalDate,
    val dateOfBirth: LocalDate,
)
