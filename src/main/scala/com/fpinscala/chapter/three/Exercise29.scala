package com.fpinscala.chapter.three

object Exercise29 {
    final def main(args: Array[String]): Unit = {
        val l0 = Leaf(0)
        val l1 = Leaf(1)
        val b0 = Branch(l0, l1)

        println("Testing size - one leaf node...")
        assert(Tree.size(l0) == Tree.sizeWithFold(l0))

        println("Testing size - one branch with two leaf nodes...")
        assert(Tree.size(b0) == Tree.sizeWithFold(b0))

        println("Testing max - two leaf nodes...")
        assert(Tree.maximum(b0) == Tree.maxWithFold(b0))

        val l2 = Leaf(2)
        val l3 = Leaf(3)
        val b1 = Branch(l2, l3)
        val b2 = Branch(b0, b1)

        println("Testing max - tree of tree branches...")
        assert(Tree.maximum(b2) == Tree.maxWithFold(b2))

        println("Testing depth - one branch...")
        assert(Tree.depth(b0) == Tree.depthWithFold(b0))

        println("Testing depth - a full tree of three branches...")
        assert(Tree.depth(b2) == Tree.depthWithFold(b2))

        val b3 = Branch(b2, l1)

        println("Testing depth - an incomplete tree...")
        assert(Tree.depth(b3) == Tree.depthWithFold(b3))

        println("Testing map - only a leaf node...")
        assert(Tree.map(l0)(_ + 1) == Tree.mapWithFold(l0)(_ + 1))

        println("Testing map - one branch...")
        assert(Tree.map(b0)(_ + 1) == Tree.mapWithFold(b0)(_ + 1))

        println("Testing map - a full tree of three branches...")
        assert(Tree.map(b2)(_ * 10) == Tree.mapWithFold(b2)(_ * 10))

        println("Testing map - an incomplete tree...")
        assert(Tree.map(b3)(_ * 10) == Tree.mapWithFold(b3)(_ * 10))

        println("All tests passed successfully!")
    }
}
