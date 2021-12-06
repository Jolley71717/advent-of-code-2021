package com.jolley71717

import java.lang.RuntimeException

object PositioningUtils {
    fun basicDirectionalChanges(startingPosition: Pair<Int, Int>, positions: List<Pair<String, Int>>): Pair<Int, Int> {
        return positions.fold(startingPosition) { previousPosition, directions  ->
            return@fold when (directions.first) {
                "forward" -> Pair(previousPosition.first + directions.second, previousPosition.second)
                "up" -> Pair(previousPosition.first, previousPosition.second - directions.second)
                "down" -> Pair(previousPosition.first, previousPosition.second + directions.second)
                else -> throw RuntimeException("No direction found for ${directions.first}")
            }
        }
    }
}