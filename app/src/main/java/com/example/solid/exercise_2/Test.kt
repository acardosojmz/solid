package com.example.solid.exercise_2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate



@RequiresApi(Build.VERSION_CODES.O)
fun main () {
    val user = User(
        fullName = "Ambrosio", country = "Mexico",
        account = "cardosojmz@gmail.com",
        password = "123456789", genre = "H",
        address = Address(
            "Lureles 121", "Fresnos",
            "Xoxocotlan", "Oaxaca"
        ),
        registrationDate = LocalDate.now(),
        dateOfBirth = LocalDate.of(1974, 12, 7)
    )

    val group = Group.Builder(id = 1, name = "Super stars")
        .addMembers(listOf(user, user) as ArrayList<User>)
        .build()

   // group.members.forEach { println(it) }


    val mathematicalTopics = Topic(
        "MAT", "Matematicas",
        listOf(
            Topic("ALG", "ALGEBRA", null),
            (Topic("TRI", "Trigonometria", null))
        )
    )

    println(mathematicalTopics)

}

