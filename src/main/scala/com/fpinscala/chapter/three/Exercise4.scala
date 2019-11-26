package com.fpinscala.chapter.three

/*
Generalize tail to the function drop, which removes the first n elements from a list.
Note that this function takes time proportional only to the number of elements being dropped,
we don’t need to make a copy of the entire List.
 */

object Exercise4 {
    final def main(args: Array[String]): Unit = {
        val lst = List(1, 2, 3, 4, 5, 6, 7, 8)
        println(List.drop(lst, 4))
    }
}
