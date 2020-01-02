package com.fpinscala.chapter.three

object Exercise17 {
    final def main(args: Array[String]): Unit = {
        val l0  = List(): List[Double]
        println("Testing an empty list...")
        assert(List.doubleToString(l0) == List())

        val l1 = List(0.0, 1.0, 2.2, 4.3, 6.4)
        println("Testing a populated list...")
        assert(List.doubleToString(l1) == List("0.0", "1.0", "2.2", "4.3", "6.4"))

        println("All tests passed!")
    }
}
