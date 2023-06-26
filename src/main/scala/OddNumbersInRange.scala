object OddNumbersInRange {
  def main(args: Array[String]): Unit = {
    val start = 251
    val end = 51

    // Print all odd numbers in descending order
    for (num <- start to end by -1) {
      if (num % 2 != 0) {
        println(num)
      }
    }
  }

}
