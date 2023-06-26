object PrintSeries6 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 23

    for (num <- start to end) {
      if (num % 3 == 0) {
        print("factor of three, ")
      } else {
        print(s"$num, ")
      }
    }
  }

}
