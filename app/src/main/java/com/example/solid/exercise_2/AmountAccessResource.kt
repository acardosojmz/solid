package com.example.solid.exercise_2

import java.lang.Double

enum class AmountAccessResource(val value: Int)  {
    DAILY(1), WEEKLY(2),
    MONTLY (10), ANUALY (Double.POSITIVE_INFINITY.toInt())
}

