object PrintTextMultipleTimes {
  def main(args: Array[String]): Unit = {
    val text = "SEEKHO BIGDATA"

    // Print the text 60 times
    for (_ <- 1 to 60){
      println(text)
    }
  }

}
