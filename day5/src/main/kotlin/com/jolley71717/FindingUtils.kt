package com.jolley71717

import java.lang.RuntimeException

object FindingUtils {

    fun groupLines(points: List<Pair<Int, Int>>): Map<Pair<Int, Int>, Int> {
        return points.groupingBy { it }.eachCount()
    }

    fun findLines(coords: List<Pair<Pair<Int, Int>, Pair<Int, Int>>>, includeDiagonal: Boolean = false): List<Pair<Int, Int>> {
        return coords.mapNotNull { line ->
            val x = line.first
            val y = line.second
            val xpoints = if (x.first < y.first) {
                genRangedNums(x.first..y.first)
            } else {
                genRangedNums(x.first downTo y.first)
            }

            val ypoints = if (x.second < y.second) {
                genRangedNums(x.second..y.second)
            } else {
                genRangedNums(x.second downTo y.second)
            }
            return@mapNotNull if (xpoints.size > ypoints.size && ypoints.size == 1) {
                xpoints.map { Pair(it, ypoints.first()) }
            } else if (xpoints.size < ypoints.size && xpoints.size == 1) {
                ypoints.map { Pair(xpoints.first(), it) }
            } else if (xpoints.size == ypoints.size) {
                if (includeDiagonal) {
                    xpoints.zip(ypoints)
                } else {
                    null
                }
            } else {
                throw RuntimeException("No case for point comparison")
            }
        }.flatten()
    }

    private fun genRangedNums(theRange: IntProgression): List<Int> {
        return theRange.map { it }
    }

}
