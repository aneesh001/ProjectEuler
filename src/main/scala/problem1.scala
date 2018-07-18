object problem1 {
  def main(args: Array[String]): Unit = {
    val ans = (1 to 999).toList.filter(x => x % 3 == 0 || x % 5 == 0).
      foldLeft(0)(_ + _)

    println(ans)
  }
}
