object NumberRangeChecker {
  def main(args: Array[String]): Unit = {
    // Declare and initialize the number
    val number = 75

    // Check if the number is within the range 0-100
    if (number >= 0 && number <= 100) {
      // Number is within the valid range
      val message = number match {
        case x if x >= 90 && x <= 100 => "Super Smart"
        case x if x >= 80 && x < 90 => "Smart"
        case x if x >= 70 && x < 80 => "Simi Smart Enough"
        case x if x >= 60 && x < 70 => "Just Smart"
        case x if x >= 35 && x < 60 => "Not Smart"
        case _ => "Dumb"
      }
      println(message)
    } else {
      // Number is not within the valid range
      println("Invalid input")
    }
  }

}
