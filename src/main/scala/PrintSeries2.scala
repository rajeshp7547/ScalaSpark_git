object PrintSeries2 {
  def main(args: Array[String]): Unit = {
    val start = 5
    val end = 25
    val step = 2

    for (num <- start to end by step) {
      val result = num * num
      print(s"$result, ")
    }
  }
}
