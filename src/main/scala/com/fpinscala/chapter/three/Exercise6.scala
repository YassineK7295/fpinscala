package com.fpinscala.chapter.three

/*
Implement a function, init, that returns a List consisting of all but the last element of a List.
 */

object Exercise6 {
    final def main(args: Array[String]): Unit = {
        val lst = List(1, 2, 3, 4)
        print(List.init(lst))
    }
}
