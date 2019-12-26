package com.fpinscala.chapter.three

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
    def init[A](l: List[A]): List[A] = l match {
        case Nil => Nil
        case Cons(_, Nil) => Nil
        case Cons(x, xs) => Cons(x, init(xs))
    }

    def length[A](as: List[A]): Int = as match {
        case Nil => 0
        case Cons(_, xs) => 1 + length(xs)
    }

    def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B): B = as match {
        case Nil => z
        case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

    @annotation.tailrec
    def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
        case Nil => Nil
        case Cons(x, xs) => if (f(x)) dropWhile(xs, f) else l
    }

    @annotation.tailrec
    def drop[A](l: List[A], n: Int): List[A] = {
        if (n == 0) l
        else {
            l match {
                case Nil => Nil
                case Cons(_, xs) => drop(xs, n-1)
            }
        }
    }

    def setHead[A](newHead: A, lst: List[A]): List[A] = {
        Cons(newHead, tail(lst))
    }

    def tail[A](lst: List[A]): List[A] = lst match {
        case Nil => Nil
        case Cons(_, xs) => xs
    }

    def sum(ints: List[Int]): Int = ints match {
        case Nil => 0
        case Cons(x,xs) => x + sum(xs)
    }

    def product(ds: List[Double]): Double = ds match {
        case Nil => 0
        case Cons(0, _) => 1
        case Cons(x, xs) => x * product(xs)
    }

    def apply[A](as: A*): List[A] = {
        if (as.isEmpty) Nil
        else Cons(as.head, apply(as.tail: _*))
    }
}