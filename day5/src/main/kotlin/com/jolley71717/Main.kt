package com.jolley71717

fun main(args: Array<String>) {
    println("Day 5!")
    val theLines = FindingUtils.findLines(RealCoords.realData)
    val groupedCountedCoord = FindingUtils.groupLines(theLines)
    val totalOverlap = groupedCountedCoord.values.filter { it >= 2 }.size

    println("Number of 2 or more overlaps: $totalOverlap")
    
    val theDiagLines = FindingUtils.findLines(RealCoords.realData, true)
    val groupDiag = FindingUtils.groupLines(theDiagLines)
    val totalDiagOverlap = groupDiag.values.filter { it >= 2 }.size

    println("Number of 2 or more overlaps Diagonal: $totalDiagOverlap")
}

