package com.fpinscala.chapter.four

object Exercise4 {
    final def main(args: Array[String]): Unit = {
        val lst = List(Option(1), Option(2), Option(3))
        val badList = List(Option(1), Option(null), Option(2), Option(3))

        println("Testing valid list...")
        assert(Option.sequence(lst) == Option(List(1, 2, 3)))

        println("Testing list with null...")
        assert(Option.sequence(badList) == Option(null))

        println("All tests passed!")
    }
}
