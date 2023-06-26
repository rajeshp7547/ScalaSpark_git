object SeriesPrinting {
  def main(args: Array[String]): Unit = {

    // Print in pattern form
    printPattern()

    // PRint in multiplied value forn
    printMultipliedValue()
  }
 def printPattern(): Unit = {
   for (num <- 2 to 16){
     print(s"$num*${num+1}, ")
   }
   println("16*17")
 }

  def printMultipliedValue(): Unit ={
    for (num <- 2 to 16) {
      print(s"${num * (num+1)}, ")
    }
    println(16* 17)
  }
}
