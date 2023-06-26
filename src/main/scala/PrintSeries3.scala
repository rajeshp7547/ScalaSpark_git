object PrintSeries3 {
  def main(args: Array[String]): Unit = {
    val repetitions = 7
    val sequence = Seq(5, 10)

    for (_ <- 1 to repetitions) {
      for (num <- sequence) {
        print(s"$num, ")
      }
    }
  }

}
