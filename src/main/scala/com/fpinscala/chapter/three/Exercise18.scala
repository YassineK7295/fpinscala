package com.fpinscala.chapter.three

object Exercise18 {
    final def main(args: Array[String]): Unit = {
        val l0  = List(): List[Double]
        println("Testing an empty list...")
        assert(List.map(l0)(_ + 1) == List())

        val l1 = List(0.0, 1.0, 2.2, 4.3, 6.4)
        println("Testing doubleToString...")
        assert(List.map(l1)(_.toString) == List("0.0", "1.0", "2.2", "4.3", "6.4"))

        val l2 = List(0, 1, 2, 3)
        println("Testing subtraction on integers...")
        assert(List.map(l2)(_ - 2) == List(-2, -1, 0, 1))

        println("All tests passed!")
    }
}
