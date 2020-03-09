package com.fpinscala.chapter.four

object Exercise3 {
    final def main(args: Array[String]): Unit = {
        val five = Option("5")
        val empty = Option(null)
        val six = Option("6")

        def combine(x: String, y: String): String = x.toString + " " + y.toString

        println("Testing Some with Some...")
        assert(map2(five, six)(combine) == Option("5 6"))

        println("Testing Some with None...")
        assert(map2(five, empty)(combine) == None)

        println("Testing None with Some...")
        assert(map2(empty, six)(combine) == None)

        println("Testing None with None...")
        assert(map2(empty, empty)(combine) == None)

        println("All tests completed successfully!")
    }

    def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
        a match {
            case Some(a) => {
                b match {
                    case Some(b) => Some(f(a, b))
                    case None => None
                }
            }
            case None => None
        }
    }
}
