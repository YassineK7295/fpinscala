package com.fpinscala.chapter.three

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree {
    def depth[A](tree: Tree[A]): Int = tree match {
        case Leaf(_) => 0
        case Branch(left, right) => 1 + depth(left).max(depth(right))
    }

    def maximum(tree: Tree[Int]): Int = tree match {
        case Leaf(x) => x
        case Branch(left: Tree[Int], right: Tree[Int]) => maximum(left).max(maximum(right))
    }

    def size[A](tree: Tree[A]): Int = tree match {
        case Leaf(_) => 1
        case Branch(left, right) => 1 + size(left) + size(right)
    }
}