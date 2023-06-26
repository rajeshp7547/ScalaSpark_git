object PrintSeries4 {
  def main(args: Array[String]): Unit = {
    val start = 4
    val end = -12
    val step = -1

    // Print in pattern format
    for (num <- start to end by step) {
      print(s"5*$num, ")
    }

    println() // Print a new line for separation

    // Print in multiplied value format
    for (num <- start to end by step) {
      val result = 5 * num
      print(s"$result, ")
    }
  }
}
