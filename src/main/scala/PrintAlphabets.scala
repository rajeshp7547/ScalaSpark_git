object PrintAlphabets {
  def main(args: Array[String]): Unit = {
    var alphabet: Char = 'A'

    // Print all alphabets
    while (alphabet <= 'Z') {
      print(alphabet + " ")
      alphabet = (alphabet + 1).toChar
    }
  }
}
