package com.fpinscala.chapter.three

// Compute the length of a list using foldRight
object Exercise9 {
    final def main(args: Array[String]): Unit = {
        val l1 = List.length(List())
        assert(l1 == 0)
        println("The length is %d.".format(l1))

        val l2 = List.length(List(1, 2, 3, 4))
        assert(l2 == 4)
        println("The length is %d.".format(l2))
    }
}
