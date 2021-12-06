package com.jolley71717

fun main(args: Array<String>) {
    println("Day 2!")
    val endResults = PositioningUtils.basicDirectionalChanges(RealData.directionsData)

    println("The basic result is ${endResults.first * endResults.second}")

    val aimResults = PositioningUtils.aimDirectionalChanges(RealData.directionsData)
    println("The aim result is ${aimResults.first * aimResults.second}")
}

