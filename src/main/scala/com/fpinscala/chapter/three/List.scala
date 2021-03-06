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

    def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = {

        @annotation.tailrec
        def hasSubsequenceInner(supInner: List[A], subInner: List[A]): Boolean = supInner match {
            case Nil => subInner match {
                case Nil => true
                case _ => false
            } case Cons(x, Nil) => subInner match {
                case Nil => true
                case Cons(y, Nil) => x == y
                case Cons(_, _) => false
            } case Cons(x, xs) => subInner match {
                case Nil => true
                case Cons(y, Nil) => if (x == y) true else hasSubsequenceInner(xs, sub)
                case Cons(y, ys) => if (x == y) hasSubsequenceInner(xs, ys) else hasSubsequenceInner(xs, sub)
            }

        }

        hasSubsequenceInner(sup, sub)
    }

    def zipWith[A](as: List[A], bs: List[A])(f: (A, A) => A): List[A] = as match {
        case Cons(x, Nil) => bs match {
            case Nil => Nil
            case Cons(y, _) => Cons(f(x, y), Nil)
        }
        case Cons(x, xs: List[A]) => bs match {
            case Nil => Nil
            case Cons(y, Nil) => Cons(f(x, y), Nil)
            case Cons(y, ys) => Cons(f(x, y), zipWith(xs, ys)(f))
        }
        case _ => Nil
    }

    // Applies the function to the first n elements of each list, where n is the size of the shortest list
    def crossApply[A](as: List[A], bs: List[A])(f: (A, A) => A): List[A] = as match {
        case Cons(x, Nil) => bs match {
            case Nil => Nil
            case Cons(y, _) => Cons(f(x, y), Nil)
        }
        case Cons(x, xs: List[A]) => bs match {
            case Nil => Nil
            case Cons(y, Nil) => Cons(f(x, y), Nil)
            case Cons(y, ys) => Cons(f(x, y), crossApply(xs, ys)(f))
        }
        case _ => Nil
    }

    def filterWithFlatMap[A](as: List[A])(f: A => Boolean): List[A] =
        flatMap(as)(x => if (f(x)) List(x) else Nil: List[A])

    def flatMap[A,B](as: List[A])(f: A => List[B]): List[B] =
        foldLeft(as, Nil: List[B])((xs, x) =>
            merge(List(xs, f(x)))
        )

    def filter[A](as: List[A])(f: A => Boolean): List[A] =
        foldRightTailRec(as, Nil: List[A])((x, xs) =>
            if (f(x)) Cons(x, xs)
            else xs
        )

    def map[A,B](as: List[A])(f: A => B): List[B] =
        foldRightTailRec(as, Nil: List[B])((x, xs) => Cons(f(x), xs))

    def doubleToString(l: List[Double]): List[String] =
        foldRightTailRec(l, Nil: List[String])((x, xs) => Cons(x.toString, xs))

    def addInteger(l: List[Int], a: Int): List[Int] =
        foldRightTailRec(l, Nil: List[Int])((x, xs) => Cons(x+a, xs))

    def merge[A](outerLst: List[List[A]]): List[A] = {
        foldRightTailRec(outerLst, Nil: List[A])((innerLst, outputLst) =>
            foldRightTailRec(innerLst, outputLst)((obj, lst) =>
                Cons(obj, lst))
        )
    }

    def appendHead[A](as: List[A], obj: A): List[A] = reverse(
        foldLeft(as, List(obj))(
            (bx, x) => Cons(x, bx)
        )
    )

    def append[A](as: List[A], obj: A): List[A] = foldRightTailRec(as, Cons(obj, Nil: List[A]))(
        (x, as) => Cons(x, as)
    )

    def foldRightTailRec[A, B](as: List[A], z: B)(f: (A, B) => B): B = foldLeft(reverse(as), z)(
        (b: B, a: A) => f(a, b)
    )

    def reverse[A](ax: List[A]): List[A] = foldLeft(ax, Nil: List[A])((bx, x) => Cons(x, bx))

    def lengthLeft[A](as: List[A]): Int = foldLeft(as, 0)((n, _) => n + 1)

    def productLeft(as: List[Int]): Int = foldLeft(as, 1)(_ * _)

    def sumLeft(as: List[Int]): Int = foldLeft(as, 0)(_ + _)

    @annotation.tailrec
    def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
        case Nil => z
        case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
    }

    def length[A](as: List[A]): Int = as match {
        case Nil => 0
        case Cons(_, xs) => 1 + length(xs)
    }

    // Note: this is not tail recursive and will cause stackOverflow
    def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {
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