package com.jolley71717

import java.lang.RuntimeException

object PositioningUtils {
    fun basicDirectionalChanges(
        positions: List<Pair<String, Int>>,
        startingPosition: Pair<Int, Int> = Pair(0, 0)
    ): Pair<Int, Int> {
        return positions.fold(startingPosition) { previousPosition, directions  ->
            return@fold when (directions.first) {
                "forward" -> Pair(previousPosition.first + directions.second, previousPosition.second)
                "up" -> Pair(previousPosition.first, previousPosition.second - directions.second)
                "down" -> Pair(previousPosition.first, previousPosition.second + directions.second)
                else -> throw RuntimeException("No direction found for ${directions.first}")
            }
        }
    }

//    down X increases your aim by X units.
//    up X decreases your aim by X units.
//    forward X does two things:
//    It increases your horizontal position by X units.
//    It increases your depth by your aim multiplied by X.
    fun aimDirectionalChanges(
    positions: List<Pair<String, Int>>,
    startingPosition: Triple<Int, Int, Int> = Triple(0, 0, 0),
): Triple<Int, Int, Int> {
    return positions.fold(startingPosition) { previousPosition, directions  ->
        return@fold when (directions.first) {
            "forward" -> Triple(
                previousPosition.first + directions.second,
                previousPosition.second + (previousPosition.third * directions.second),
                previousPosition.third
            )
            "up" -> Triple(
                previousPosition.first,
                previousPosition.second,
                previousPosition.third - directions.second
            )
            "down" -> Triple(
                previousPosition.first,
                previousPosition.second,
                previousPosition.third + directions.second
            )
            else -> throw RuntimeException("No direction found for ${directions.first}")
        }
    }
    }
}