package com.fpinscala.chapter.three

object Exercise26 {
    final def main(args: Array[String]): Unit = {
        val l0 = Leaf(0)
        val l1 = Leaf(1)
        val b0 = Branch(l0, l1)

        println("Testing maximum of two leaf nodes...")
        assert(Tree.maximum(b0) == 1)

        val l2 = Leaf(2)
        val l3 = Leaf(3)
        val b1 = Branch(l2, l3)
        val b2 = Branch(b0, b1)

        println("Testing using tree of tree branches...")
        assert(Tree.maximum(b2) == 3)

        println("All tests passed successfully!")
    }
}
