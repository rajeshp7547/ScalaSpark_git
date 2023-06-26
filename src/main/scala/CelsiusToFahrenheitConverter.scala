import scala.io.StdIn

object CelsiusToFahrenheitConverter {
  def main(args: Array[String]): Unit = {

    // Read the input temperature in Celsius from the user
    println("Enter the temp. in degrees Celsius:")
    val celsius = StdIn.readDouble()

    // Convert Celsius to Fahrenheit
    val fahrenheit = celsius * 9 / 5 +32

    // Print the result
    println(s"${celsius}°C is equal to ${fahrenheit}°F")
  }

}
