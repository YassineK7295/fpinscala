package com.fpinscala.chapter.three

object Exercise24 {
    final def main(args: Array[String]): Unit = {
        val l0 = List(1, 2, 3, 4)
        val l1 = List(1, 2)
        val l2 = List(2, 3)
        val l3 = List(4)

        println("Testing given tests...")
        assert(List.hasSubsequence(l0, l1))
        assert(List.hasSubsequence(l0, l2))
        assert(List.hasSubsequence(l0, l3))

        val l4 = List(1, 3)

        println("Testing incorrect subsequence...")
        assert(!List.hasSubsequence(l0, l4))

        val l5 = List()

        println("Testing Nil list...")
        assert(List.hasSubsequence(l5, l5))

        println("All tests passed successfully!")
    }
}
