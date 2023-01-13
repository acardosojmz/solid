package com.example.solid.exercise_2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

data class Contract (val user: User,
                     val date: LocalDate,
                     val contractDetails: List<ContractDetail>){

    @RequiresApi(Build.VERSION_CODES.O)
    fun isValid(resourceOfType: ResourceOfType): Boolean{
        val resourceSearched = contractDetails.firstOrNull { it.resourceOfType==resourceOfType }
        val currentDate = LocalDate.now()

        val finalDate =
                when(resourceSearched?.membershipType){
                    is MembershipType.Daily -> date.plusDays(1)
                    is MembershipType.Weekly -> date.plusWeeks(1)
                    is MembershipType.Montly -> date.plusMonths(1)
                    is MembershipType.Anualy -> date.plusYears(8999)
                    else -> {LocalDate.now().plusDays(-1)}
                }
        return (currentDate>=date && currentDate<=finalDate)
    }
}