package com.fpinscala.chapter.three

object Exercise11 {
    final def main(args: Array[String]): Unit = {
        val l1 = List(1, 2, 3, 4)
        assert(List.sumLeft(l1) == 10)
        println("Sum of List(1, 2, 3, 4) is 10.")

        val l2 = List(1, 2, 3, 4)
        assert(List.productLeft(l2) == 24)
        println("Product of List(1, 2, 3, 4) is 24.")

        val l3 = List(1, 2, 4, 8, 16)
        assert(List.lengthLeft(l3) == 5)
        println("Length of List(1, 2, 4, 8, 16) is 5.")
    }
}
