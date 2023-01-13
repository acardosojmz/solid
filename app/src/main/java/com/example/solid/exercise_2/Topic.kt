package com.example.solid.exercise_2

data class Topic(val code: String,
                 val topic: String,
                 val subtopics:List<Topic>?
                 )