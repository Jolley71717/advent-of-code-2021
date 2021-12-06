package com.jolley71717

object TestVentData {
    val testVents = listOf(
    Pair(Pair(0,9), Pair(5,9)),
    Pair(Pair(8,0), Pair(0,8)),
    Pair(Pair(9,4), Pair(3,4)),
    Pair(Pair(2,2), Pair(2,1)),
    Pair(Pair(7,0), Pair(7,4)),
    Pair(Pair(6,4), Pair(2,0)),
    Pair(Pair(0,9), Pair(2,9)),
    Pair(Pair(3,4), Pair(1,4)),
    Pair(Pair(0,0), Pair(8,8)),
    Pair(Pair(5,5), Pair(8,2)),
    )

    /**
     * Original not working*****
     * As Diagonal
     * 2.1....1..
     * .211...1..
     * ..3.11.1..
     * ...2.111..
     * .112312311
     * .....2..1.
     * ......2...
     * .......2..
     * ........2.
     * 222111....
     */

    /**
     *
     * 1.1....11.
     * .111...2..
     * ..2.1.111.
     * ...1.2.2..
     * .112313211
     * ...1.2....
     * ..1...1...
     * .1.....1..
     * 1.......1.
     * 222111....
     */
}