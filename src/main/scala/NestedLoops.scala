object NestedLoops {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3) {
      println(s"Outer loop: i = $i")

      for (j <- 1 to 2) {
        println(s"  Inner loop: j = $j")
      }
    }
  }
}
