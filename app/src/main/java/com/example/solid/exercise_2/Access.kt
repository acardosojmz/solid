package com.example.solid.exercise_2

data class Access(val user: User, val resourceOfType: ResourceOfType) {

    fun isAuthorized(): Boolean{


        return  false
    }
}