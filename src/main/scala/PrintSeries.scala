object PrintSeries {
  def main(args: Array[String]): Unit = {
    var number1 = 10
    var number2 = 9

    while (number1 >= -5 && number2 >= -6) {
      print(s"$number1@$number2, ")
      number1 -= 1
      number2 -= 1
    }
  }

}
