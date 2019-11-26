package com.fpinscala.chapter.three

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
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

    def product(ints: List[Int]): Int = ints match {
        case Nil => 0
        case Cons(0, xs) => 0
        case Cons(x, xs) => x * product(xs)
    }

    def apply[A](as: A*): List[A] = {
        if (as.isEmpty) Nil
        else Cons(as.head, apply(as.tail: _*))
    }
}