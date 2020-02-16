package com.fpinscala.chapter.three

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree {
    def mapWithFold[A,B](tree: Tree[A])(f: A => B): Tree[B] = {
        fold(tree)(x => Leaf(f(x)): Tree[B])((x, y) => Branch(x, y))
    }

    def depthWithFold[A](tree: Tree[A]): Int = {
        fold(tree)(_ => 0)((x, y) => 1 + x.max(y))
    }

    def maxWithFold(tree: Tree[Int]): Int = {
        fold(tree)(x => x)((x, y) => x.max(y))
    }

    def sizeWithFold[A](tree: Tree[A]): Int = {
        fold(tree)(_ => 1)((x: Int, y: Int) => 1 + x + y)
    }

    def fold[A,B,C](tree: Tree[A])(f: A => B)(g: (B, B) => B): B = tree match {
        case Leaf(v) => f(v)
        case Branch(left, right) => g(fold(left)(f)(g), fold(right)(f)(g))
    }

    def map[A,B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
        case Leaf(v) => Leaf(f(v))
        case Branch(left, right) => Branch(map(left)(f), map(right)(f))
    }

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