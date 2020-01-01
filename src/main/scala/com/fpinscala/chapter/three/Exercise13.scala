package com.fpinscala.chapter.three

object Exercise13 {
    final def main(args: Array[String]): Unit = {
        val l0 = List()
        assert(List.foldRightTailRec(l0: List[Int], 0: Int)(_ + _) == List.foldRight(l0: List[Int], 0: Int)(_ + _ ))
        println("The sum using foldRight of List() is 0.")

        val l1 = List(1, 2, 3, 4)
        assert(List.foldRightTailRec(l1, 0)(_ + _) == List.foldRight(l1, 0)(_ + _))
        println("Sum of List(1, 2, 3, 4) is 10.")

        assert(List.foldRightTailRec(l1, 1.0)(_ * _) == List.foldRight(l1, 1.0)(_ * _))
        println("Product of List(1, 2, 3, 4) is 24.")

        assert(List.foldRightTailRec(l1, 0)((x, y) => x-y*y) == List.foldRight(l1, 0)((x, y) => x-y*y))
        assert(List.foldRightTailRec(l1, 0)(_ - _) == List.foldRight(l1, 0)(_ - _))
    }
}
