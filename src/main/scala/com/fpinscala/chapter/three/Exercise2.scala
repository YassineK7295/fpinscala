package com.fpinscala.chapter.three

/*
Implement the function tail for removing the first element of a List.
Note that the function takes constant time.
 */

object Exercise2 {
    final def main(args: Array[String]): Unit = {
        val lst = List(1, 2, 3, 4, 5)
        print(List.tail(lst))
    }
}