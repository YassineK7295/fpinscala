package com.fpinscala.chapter.three

object Exercise27 {
    final def main(args: Array[String]): Unit = {
        val l0 = Leaf(0)

        println("Testing for only a leaf node...")
        assert(Tree.depth(l0) == 0)

        val l1 = Leaf(1)
        val b0 = Branch(l0, l1)

        println("Testing one branch...")
        assert(Tree.depth(b0) == 1)

        val l2 = Leaf(2)
        val l3 = Leaf(3)
        val b1 = Branch(l2, l3)
        val b2 = Branch(b0, b1)

        println("Testing a full tree of tree branches...")
        assert(Tree.depth(b2) == 2)

        val b3 = Branch(b2, l1)

        println("Testing an incomplete tree...")
        assert(Tree.depth(b3) == 3)

        println("All tests passed successfully!")
    }
}
