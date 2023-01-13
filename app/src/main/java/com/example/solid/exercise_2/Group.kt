package com.example.solid.exercise_2


class Group private  constructor(
    val id: Int,
    val name:String,
    val members:List<User>,
    ){
    data class Builder(val id:Int,
                       val name: String) {

        private val members= ArrayList<User>()

        fun addMember(member: User): Builder {
            members.add(member)
            return this
        }
        fun addMembers(elements: ArrayList<User>): Builder {
            members.addAll(elements)
            return this
        }

        fun build()= Group (id, name, members)
    }


}