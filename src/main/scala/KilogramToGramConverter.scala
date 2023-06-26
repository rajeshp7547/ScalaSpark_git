import scala.io.StdIn

object KilogramToGramConverter {
  def main(args: Array[String]): Unit = {

    // Read the input weight in kilogram from user
    println("Enter weight in kilograms:")
  val kilograms = StdIn.readDouble()

    // Convert kilograms to grams
    val grams = kilograms * 1000

    // Print the result
    println(s"${kilograms}kg is equal to ${grams}g")

  }

}
