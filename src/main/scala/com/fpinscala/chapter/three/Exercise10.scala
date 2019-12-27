package com.fpinscala.chapter.three

object Exercise10 {
    final def main(args: Array[String]): Unit = {
        val l1 = List()
        assert(List.foldLeft(l1: List[Int], 0)(_ - _) == 0)
        println("The output of foldLeft on an empty list with sub op is zero.")

        val l2 = List(1, 2, 3, 4)
        assert(List.foldLeft(l2, 0)(_ - _) == -10)
        println("The output of foldLeft on List(1, 2, 3, 4) with sub op is -10.")

        val l3 = List(1, 2, 4, 8, 16)
        assert(List.foldLeft(l3, 1.0)(_ / _) == 0.0009765625)
        println("The output of foldLeft on List(1, 2, 4, 8, 16) with division op is 0.0009765625.")
    }
}
