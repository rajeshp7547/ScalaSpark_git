object AverageCalculator {
  def main(args: Array[String]): Unit = {
    val start = 24
    val end = 100
    val step = 2

    var sum = 0
    var count = 0

    // Calculate the sum and count of numbers
    for (num <- start to end by step) {
      sum += num
      count += 1
    }
    val average = sum.toDouble / count

    println(s"The average of the series from $start to $end is: $average")

  }

}
