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
        val endCombo = PositioningUtils.basicDirectionalChanges(Pair(0,0),directions)
        assertEquals(Pair(3,2), endCombo)
    }
    @Test
    fun testDirections() {
        val endCombo = PositioningUtils.basicDirectionalChanges(Pair(0,0), TestDirections.testDirections)
        assertEquals(Pair(15, 10), endCombo)
        assertEquals(150, endCombo.first * endCombo.second)
    }

}