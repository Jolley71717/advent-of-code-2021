package com.jolley71717

fun main(args: Array<String>) {
    println("Day 2!")
    val endResults = PositioningUtils.basicDirectionalChanges(Pair(0,0), RealData.directionsData)

    println("The end result is ${endResults.first * endResults.second}")

}

