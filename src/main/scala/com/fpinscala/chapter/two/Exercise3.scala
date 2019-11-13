package com.fpinscala.chapter.two

// Curry HOF
object Exercise3 {
    final def main(args: Array[String]): Unit = {
        println("This is named after the mathematician Haskell Curry, who discovered the principle. It was independently discovered earlier by Moses Schoenfinkel, but Schoenfinkelization didn’t catch on.")
    }

    def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
        (a: A) => {
            (b: B) => {
                f(a, b)
            }
        }
    }
}
