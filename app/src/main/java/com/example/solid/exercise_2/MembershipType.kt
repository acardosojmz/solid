package com.example.solid.exercise_2

sealed class MembershipType {
    data class Daily(val cost: Double) : MembershipType()
    data class Weekly(val cost: Double) : MembershipType()
    data class Montly(val cost: Double) : MembershipType()
    data class Anualy(val cost: Double) : MembershipType()
    data class Groupaly(val cost: Double, val group: Group) : MembershipType()
}
