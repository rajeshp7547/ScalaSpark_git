object FindLargestNumber {
  def main(args: Array[String]): Unit = {

    // Declare and initialize three variables
    val num1 = 10
    val num2 = 25
    val num3 = 17

    //Find the largest number among the three
    val largestNumber = if (num1 >= num2 && num1 >= num3) {
      num1
    } else if (num2 >= num1 && num2 >= num3) {
      num2
    }else {
      num3
    }
    // Print the largest number
    println(s"The largest number among $num1, $num2, and $num3 is $largestNumber")

  }

}
