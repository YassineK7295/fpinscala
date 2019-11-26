package com.fpinscala.chapter.three

/*
Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
 */

object Exercise5 {
    final def main(args: Array[String]): Unit = {
        val lst = List(1, 2, 3, 4, 5, 6)

        print(List.dropWhile(lst, (ele: Int) => {
            ele <= 3
        }))
    }
}
