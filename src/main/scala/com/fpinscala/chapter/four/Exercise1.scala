package com.fpinscala.chapter.four

object Exercise1 {
    final def main(args: Array[String]): Unit = {
        val five = Option(5)
        val empty = Option(null)

        println("Testing map...")
        assert(five.map(_ + 1) == Option(6))
        assert(five.map(_ + 1) == Some(6))
        assert(empty.map(_.toString) == Option(null))

        println("Testing getOrElse...")
        assert(five.getOrElse(0) == 5)
        assert(empty.getOrElse(0) == 0)

        println("Testing flatMap...")
        assert(five.flatMap(x => Option(x + 1)) ==  Option(6))
        assert(five.flatMap(x => Option(x/0)) ==  Option(null))
        assert(empty.flatMap(x => Option(x.toString)) == Option(null))

        println("Testing orElse...")
        assert(five.orElse(Option(0)) == Option(5))
        assert(empty.orElse(Option(0)) == Option(0))

        println("Testing filter...")
        assert(five.filter(_ % 2 == 1) == Option(5))
        assert(five.filter(_ % 2 == 0) == Option(null))
        assert(empty.filter(_.toString.equals("")) == Option(null))

        println("All tests passed!")
    }
}
