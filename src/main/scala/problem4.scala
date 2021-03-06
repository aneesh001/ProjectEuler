object problem4 {
  def isPalindrome(num: Int): Boolean = {
    val rev = num.toString.toList.
      foldRight(0)((x, acc) => acc * 10 + x.asDigit)

    rev == num
  }

  def main(args: Array[String]): Unit = {
    val res = for {
      i <- (999 to 100 by -1).toList
      j <- (999 to 100 by -1).toList
      if(isPalindrome(i * j))
    } yield (i * j)

    println(res.max)
  }
}
