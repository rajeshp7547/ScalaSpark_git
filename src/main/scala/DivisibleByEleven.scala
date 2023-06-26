object DivisibleByEleven {
  def main(args: Array[String]): Unit = {

    // Iterate from 250 to 550
    for (num <- 250 to 550){
      if (num % 11 == 0){
        println(num)
      }
    }
  }

}
