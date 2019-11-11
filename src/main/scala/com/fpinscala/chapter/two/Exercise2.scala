package com.fpinscala.chapter.two

// Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function
object Exercise2 {
    final def main(args: Array[String]): Unit = {
        val testRight = Array(1, 2, 3, 4, 5, 8, 9, 9, 10)
        val testWrong = Array(1, 2, 5, 5, 3, 4)

        println("The array testRight is sorted: %b".format(isSorted[Int](testRight, intCompare)))
        println("The array testWrong is sorted: %b".format(isSorted[Int](testWrong, intCompare)))
    }

    def isSorted[A](arr: Array[A], ordered: (A,A) => Boolean): Boolean = {
        @annotation.tailrec
        def loop(i: Int): Boolean =
            if (i >= arr.length-2) true
            else if (!ordered(arr(i), arr(i+1))) false
            else loop(i + 1)

        loop(0)
    }

    def intCompare(small: Int, large: Int): Boolean = small <= large
}
