package com.fpinscala.chapter.two

object Exercise1 {
    final def main(args: Array[String]): Unit = {
        val test: List[(Int, Int)] = List((1,1), (2,1), (3,2), (4,3), (5,5), (6,8))
        test.foreach(x => println(fib(x._1) == x._2) )
    }

    def fib(n: Int): Int = {
        def go(m: Int): Int =
            if (m == 1 || m == 2) 1
            else go(m-1) + go(m-2)

        go(n)
    }
}
