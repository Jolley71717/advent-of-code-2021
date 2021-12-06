package com.jolley71717

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class TestVents {

    @Test
    fun testthedata() {
        val theLines = FindingUtils.findLines(TestVentData.testVents)
        val groupedCountedCoord = FindingUtils.groupLines(theLines)
        val maxX = theLines.maxOf { it.first }
        val maxY = theLines.maxOf { it.second }
        for (y: Int in 0..maxY) {
            println()
            for (x: Int in 0..maxX) {
                print(groupedCountedCoord[Pair(x,y)] ?: ".")
            }
        }
        val biggestOverlap = groupedCountedCoord.values.filter { it >= 2 }.size
        assertNotNull(biggestOverlap)
        assertEquals(5, biggestOverlap)
    }

    @Test
    fun testDiagonal() {
        val theLines = FindingUtils.findLines(TestVentData.testVents, true)
        val groupedCountedCoord = FindingUtils.groupLines(theLines)
        val maxX = theLines.maxOf { it.first }
        val maxY = theLines.maxOf { it.second }
        for (y: Int in 0..maxY) {
            println()
            for (x: Int in 0..maxX) {
                print(groupedCountedCoord[Pair(x,y)] ?: ".")
            }
        }
        val biggestOverlap = groupedCountedCoord.values.filter { it >= 2 }.size
        assertNotNull(biggestOverlap)
        assertEquals(12, biggestOverlap)
    }
}