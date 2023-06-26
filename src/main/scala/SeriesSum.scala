object SeriesSum {
  def main(args: Array[String]): Unit = {
    val start = 5
    val end = 102

    var sum = 0

    // Calculate the sum of squares
    for (num <- start to end) {
      sum += num * num

    }

    println(s"The sum of the series is: $sum")

  }

}
