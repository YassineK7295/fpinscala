package com.fpinscala.chapter.three

object Exercise20 {
    final def main(args: Array[String]): Unit = {
        val l0 = List()
        assert(List.flatMap(l0)(i => List(i, i)) == List())

        val l1 = List(1, 2, 3)
        assert(List.flatMap(l1)(i => List(i, i)) == List(1, 1, 2, 2, 3, 3))

        val l2 = List(-1, 0, 1, 2)
        assert(List.flatMap(l2)(i => List(i, i*i)) == List(-1, 1, 0, 0, 1, 1, 2, 4))

        println("All tests passed successfully!")
    }
}
