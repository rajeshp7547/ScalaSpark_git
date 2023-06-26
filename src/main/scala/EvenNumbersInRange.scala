object EvenNumbersInRange {
  def main(args: Array[String]): Unit = {
    val start = 700
    val end = 900

    // Print all even numbers in the range
    for (num <- start to end) {
      if (num % 2 == 0) {
        println(num)
      }
    }
  }

}
