object SumNumbersInRange {
  def main(args: Array[String]): Unit = {

    val start = 56
    val end = 153

    var sum = 0

    // Calculate the sum of numbers from start to end
    for (num <- start to end) {
      sum += num
    }
    println(s"The sum of numbers from $start to $end is: $sum")

  }

}
