package com.fpinscala.chapter.four

object Exercise3 {
    final def main(args: Array[String]): Unit = {
        val five = Option("5")
        val empty = Option(null)
        val six = Option("6")

        def combine(x: String, y: String): String = x.toString + " " + y.toString

        println("Testing Some with Some...")
        assert(Option.map2(five, six)(combine) == Option("5 6"))

        println("Testing Some with None...")
        assert(Option.map2(five, empty)(combine) == None)

        println("Testing None with Some...")
        assert(Option.map2(empty, six)(combine) == None)

        println("Testing None with None...")
        assert(Option.map2(empty, empty)(combine) == None)

        println("All tests completed successfully!")
    }
}
