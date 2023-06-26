object PrintSeries8 {
  def main(args: Array[String]): Unit = {
    val start = 0.5
    val end = 5.1
    val step = 0.2

    var num = start

    while (num <= end) {
      val result = num * num
      print(f"$result%.2f, ")
      num += step
    }
  }
}