package com.example.solid.dip

import java.time.LocalDate

class EmployeeDao(
    val id:Int,
    val fullName:String,
    val dateOfAdmision:LocalDate,
    val area: String
):DAO()

