package com.fpinscala.chapter.three

object Exercise25 {
    final def main(args: Array[String]): Unit = {
        val l0 = Leaf(0)
        val l1 = Leaf(1)
        val b0 = Branch(l0, l1)

        println("Testing one leaf node...")
        assert(Tree.size(l0) == 1)

        println("Testing one branch with two leaf nodes...")
        assert(Tree.size(b0) == 3)

        println("All tests passed successfully!")
    }
}
