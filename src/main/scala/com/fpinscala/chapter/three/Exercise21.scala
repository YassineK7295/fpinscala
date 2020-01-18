package com.fpinscala.chapter.three

object Exercise21 {
    final def main(args: Array[String]): Unit = {
        val l0  = List(): List[Double]
        println("Testing an empty list...")
        assert(List.filterWithFlatMap(l0)(_ > 1) == List.filter(l0)(_ > 1))

        val l1 = List(0, 1, 2, 3, 4)
        println("Testing filtering of odd numbers...")
        assert(List.filterWithFlatMap(l1)(_ % 2 == 0) == List.filter(l1)(_ % 2 == 0))

        println("All tests passed!")
    }
}
