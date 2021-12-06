package com.jolley71717

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestDirectionalChanges {

    @Test
    fun testOne() {
        val directions = listOf(
            Pair("forward", 3),
            Pair("down", 5),
            Pair("up", 3)
        )
        val endCombo = PositioningUtils.basicDirectionalChanges(directions)
        assertEquals(Pair(3,2), endCombo)
    }

    @Test
    fun testDirections() {
        val endCombo = PositioningUtils.basicDirectionalChanges(TestDirections.testDirections)
        assertEquals(Pair(15, 10), endCombo)
        assertEquals(150, endCombo.first * endCombo.second)
    }

    @Test
    fun testWithAim() {
        val endCombo = PositioningUtils.aimDirectionalChanges(TestDirections.testDirections)
        assertEquals(Triple(15, 60, 10), endCombo)
        assertEquals(900, endCombo.first * endCombo.second)
    }
}