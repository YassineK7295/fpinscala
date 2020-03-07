package com.fpinscala.chapter.four

case object Exercise2 {
    final def main(args: Array[String]): Unit = {
        val validSeq: Seq[Double] = Seq(1, 2, 3, 4)
        val invalidSeq = Seq()

        println("Testing valid variance function...")
        assert(variance(validSeq).getOrElse(0: Double) == 1.25)

        println("Testing invalid variance function...")
        assert(variance(invalidSeq).getOrElse(0: Double) == 0)

        println("All tests passed!")
    }

    // If any flatMap fails, immediately aborts, as None.flatMap is None without evaluating f
    def variance(xs: Seq[Double]): Option[Double] = {
        val n = xs.length
        val mu = xs.sum / n
        Option(xs.map(x => Option(x)
            .flatMap(x => Option(x - mu)
            .flatMap(x => Option(math.pow(x, 2)))
            .flatMap(x => Option(x / n))
        ).getOrElse(0: Double)).sum)
    }
}
