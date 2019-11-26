package com.fpinscala.chapter.three

/*
Using the same idea, implement the function setHead for
replacing the first element of a List with a different value.
 */

object Exercise3 {
    final def main(args: Array[String]): Unit = {
        val lst = List(1, 2, 3, 4, 5, 6, 7, 8)
        println(List.setHead(4, lst))
    }
}
