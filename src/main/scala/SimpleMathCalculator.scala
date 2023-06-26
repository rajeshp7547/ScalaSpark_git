

import scala.io.StdIn

object SimpleMathCalculator {
  def main(args: Array[String]): Unit = {
    // Read the input numbers and operation from the user
     println("Enter the first number:")
    val num1 = StdIn.readDouble()

    println("Enter the second number:")
    val num2 = StdIn.readDouble()

    println("Enter the operation (+, -, *, /):")
    val operation = StdIn.readLine()

    // Perform the math operation based on the user input
    val result = operation match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "*" => num1 * num2
      case "/" => num1 / num2
      case _   => "Invalid operation"
    }

    //Print the Result
    println(s"Result: $result")
  }

}
