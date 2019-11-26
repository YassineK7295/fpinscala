package com.fpinscala.chapter.three

/*
What will be the result of the following match expression?
Answer: 3
 */

object Exercise1 {
    final def main(args: Array[String]): Unit = {
        val x = List(1,2,3,4,5) match {
            case Cons(x, Cons(2, Cons(4, _))) => x
            case Nil => 42
            case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
            case Cons(h, t) => h + List.sum(t)
            case _ => 101
        }
        print(x)
    }
}