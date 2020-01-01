package com.fpinscala.chapter.three

object Exercise15 {
    final def main(args: Array[String]): Unit = {
        val l0 = List(List(), List())
        assert(List.merge(l0) == List())

        val l1 = List(List(1, 2), List(3), List(4, 5, 6))
        assert(List.merge(l1) == List(1, 2, 3, 4, 5, 6))

        val l2 = List(List(), List(1), List(), List(2, 3))
        assert(List.merge(l2) == List(1, 2, 3))

        println("All tests passed!")
    }
}
