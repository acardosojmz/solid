package com.example.solid.exercise_2

sealed class MembershipType {
    data class Daily(val resourceLimit: ResourceLimit) : MembershipType()
    data class Weekly(val resourceLimit: ResourceLimit) : MembershipType()
    data class Montly(val resourceLimit: ResourceLimit) : MembershipType()
    data class Anualy(val resourceLimit: ResourceLimit) : MembershipType()
    data class Groupaly(val resourceLimit: ResourceLimit, val group: Group) : MembershipType()
}
