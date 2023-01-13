package com.example.solid.exercise_2

interface Resource {
    val title: String
    val code: String
    val author: Author
    val area: String
    val isMembershipRequired: Boolean
}