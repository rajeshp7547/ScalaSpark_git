object CountEvenNumbersInRange {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 100

    var count = 0

    // Count the even numbers in the range
    for (num <- start to end) {
      if (num % 2 == 0) {
        count += 1
      }
    }

    println(s"The count of even numbers between $start and $end is: $count")
  }
}
