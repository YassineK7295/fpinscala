package com.fpinscala.chapter.three

// What happens when you execute foldRight(List(1, 2, 3), Nil:List[Int])(Cons(_, _))
object Exercise8 {
    final def main(args: Array[String]): Unit = {
        // Creates a copy of the "as" list parameter
        print(List.foldRight(List(1, 2, 3), Nil:List[Int])(Cons(_, _)))
    }
}