package com.fpinscala.chapter.three

object Exercise14 {
    final def main(args: Array[String]): Unit = {
        val l0 = List()
        assert(List.append(l0, 1) == List(1))
        assert(List.appendHead(l0, 1) == List(1))

        val l1 = List(1, 2, 3)
        assert(List.append(l1, 4) == List(1, 2, 3, 4))
        assert(List.appendHead(l1, 0) == List(0, 1, 2, 3))

        println("All tests passed!")
    }
}
