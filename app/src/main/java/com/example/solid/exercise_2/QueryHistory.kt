package com.example.solid.exercise_2

import java.time.LocalDate

data class QueryHistory (val user: User,
                         val date: LocalDate,
                         val resource: Resource
)
