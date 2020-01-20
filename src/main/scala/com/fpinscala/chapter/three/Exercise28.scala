package com.fpinscala.chapter.three

object Exercise28 {
    final def main(args: Array[String]): Unit = {
        val l0 = Leaf(0)
        val l0Mapped = Leaf(1)

        println("Testing for only a leaf node...")
        assert(Tree.map(l0)(_ + 1) == l0Mapped)

        val l1 = Leaf(1)
        val b0 = Branch(l0, l1)
        val b0Mapped = Branch(Leaf(1), Leaf(2))

        println("Testing one branch...")
        assert(Tree.map(b0)(_ + 1) == b0Mapped)

        val l2 = Leaf(2)
        val l3 = Leaf(3)
        val b1 = Branch(l2, l3)
        val b2 = Branch(b0, b1)

        println("Testing a full tree of three branches...")
        assert(Tree.map(b2)(_ * 10) == Branch(Branch(Leaf(0), Leaf(10)), Branch(Leaf(20), Leaf(30))))

        val b3 = Branch(b2, l1)

        println("Testing an incomplete tree...")
        assert(Tree.map(b3)(_ * 10) == Branch(Branch(Branch(Leaf(0), Leaf(10)), Branch(Leaf(20), Leaf(30))), Leaf(10)))

        println("All tests passed successfully!")
    }
}
