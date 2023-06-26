object InfiniteLoop {
  def main(args: Array[String]): Unit = {
    for (i <- Stream.continually(1)) {
      // Code that will execute indefinitely
    }
  }
}
