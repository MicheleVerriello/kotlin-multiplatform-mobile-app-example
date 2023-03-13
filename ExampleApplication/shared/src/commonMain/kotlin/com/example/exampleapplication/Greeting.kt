package com.example.exampleapplication

import kotlinx.datetime.*

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, Christmas is in ${daysUntilNewYear()} days!"
    }

    private fun daysUntilNewYear(): Int {
        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
        val closestNewYear = LocalDate(today.year, 12, 25)
        return today.daysUntil(closestNewYear)
    }
}