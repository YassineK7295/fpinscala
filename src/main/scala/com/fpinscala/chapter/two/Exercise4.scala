package com.fpinscala.chapter.two

// Uncurry HOF
object Exercise4 {
    final def main(args: Array[String]): Unit = {

    }

    def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
        (a: A, b: B) => {
            (c: C) => {
                c
            }
        }
    }
}
