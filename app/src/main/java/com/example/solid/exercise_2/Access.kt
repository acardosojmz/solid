package com.example.solid.exercise_2

data class Access(val user: User, val resource: Resource) {
    fun isAuthorized(): Boolean{
        if (!resource.isMembershipRequired) return  true

        return  true
    }
}