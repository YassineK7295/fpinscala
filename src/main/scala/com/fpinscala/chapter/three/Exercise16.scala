package com.fpinscala.chapter.three

object Exercise16 {
    final def main(args: Array[String]): Unit = {
        val l0  = List(): List[Int]
        println("Testing an empty list...")
        assert(List.addInteger(l0, 1) == List())

        val l1 = List(0, 1, 2, 4, 6)
        println("Testing a populated list...")
        assert(List.addInteger(l1, -1) == List(-1, 0, 1, 3, 5))

        println("All tests passed!")
    }
}
