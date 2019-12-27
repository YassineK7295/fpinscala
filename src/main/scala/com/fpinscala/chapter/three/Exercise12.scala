package com.fpinscala.chapter.three

object Exercise12 {
    final def main(args: Array[String]): Unit = {
        val l1 = List()
        assert(List.reverse(l1) == List())
        println("Reverse of List() is List().")

        val l2 = List(1, 2, 3, 4)
        assert(List.reverse(l2) == List(4, 3, 2, 1))
        println("Reverse if List(1, 2, 3, 4) is List(4, 3, 2, 1).")
    }
}
