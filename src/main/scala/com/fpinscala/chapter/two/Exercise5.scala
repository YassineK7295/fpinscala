package com.fpinscala.chapter.two

// Composition of a function
object Exercise5 {
    final def main(args: Array[String]): Unit = {

    }

    def compose[A,B,C](f: B => C, g: A => B): A => C = {
        (a: A) => {
            f(g(a))
        }
    }

}
