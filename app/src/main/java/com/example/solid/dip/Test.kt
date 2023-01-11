package com.example.solid.dip

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    val driverPostgres ="host=192.168.2.2; port=5432"
    val driverMysql = "host=192.168.2.3; port=3306"
    val driverOracle ="host=www.itvo.edu.mx"

    Database.setConnection(Oracle(driverOracle))
    //Database.setConnection(Postgres(driverPostgres))
    //Database.setConnection(MySql(driverMysql))
    val productDao = ProductDao(id=0, description = "Laptop",2,33000.00)
    productDao.getProperties().forEach { println(it) }
    productDao.save()

    val employeeDao= EmployeeDao(id=0,
        fullName = "Ambrosio Cardoso",
        dateOfAdmision = LocalDate.now(),
        area = "DCEA"
    )
    println("-------------------------")
    employeeDao.getProperties().forEach { println(it) }
    employeeDao.save()
}