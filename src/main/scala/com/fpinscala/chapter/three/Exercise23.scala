package com.fpinscala.chapter.three

object Exercise23 {
    final def main(args: Array[String]): Unit = {
        println("Testing given test...")
        val l0 = List(1, 2, 3)
        val l1 = List(4, 5, 6)
        assert(List.zipWith(l0, l1)(_ + _) == List(5, 7, 9))

        println("Testing list size mismatch...")
        val l2 = List(1, 2)
        assert(List.zipWith(l0, l2)(_ + _) == List(2, 4))
        assert(List.zipWith(l2, l0)(_ + _) == List(2, 4))

        println("Testing empty list...")
        val l3 = List()
        assert(List.zipWith(l0, l3)(_ + _) == List())
        assert(List.zipWith(l3, l0)(_ + _) == List())

        println("All tests passed successfully!")
    }
}
