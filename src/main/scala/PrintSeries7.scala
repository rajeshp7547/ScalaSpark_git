object PrintSeries7 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 23

    for (num <- start to end) {
      if (num % 2 != 0) {
        print(s"$num, ")
      } else if (num % 5 == 0) {
        print("divisible by five, ")
      }
    }
  }
}
