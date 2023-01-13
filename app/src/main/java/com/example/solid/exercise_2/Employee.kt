package com.example.solid.exercise_2

import java.time.LocalDate

data class Employee (val id: Int,
                     val fullName: String,
                     val genre: String,
                     val dateOfBirth: LocalDate,
                     val dateOfAdmission: LocalDate,
                     val skills: List<Skill>
)
