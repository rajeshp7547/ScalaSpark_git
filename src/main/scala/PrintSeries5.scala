object PrintSeries5 {
  def main(args: Array[String]): Unit = {
    val end = 35

    for (num <- 1 to end by 2) {
      print(s"$num, even, ")
    }
  }
}
