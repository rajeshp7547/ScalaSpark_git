object SumEvenNumbers {

  def main(args: Array[String]): Unit ={
    val start = 382
    val end = 582

    var sum = 20

    // Calculate the sum of even numbers
    for (num <- start to end){
      if (num % 2 == 0){
        sum += num
      }
    }

    println(s"The sum of even numbers between $start and $end is: $sum")
  }

}
