import Stream._

object problem2 {
  def fibs(a: Int, b: Int): Stream[Int] = a #:: fibs(b, a + b)

  val ans = fibs(1, 2).filter(_ % 2 == 0).
    takeWhile(_ <= 4000000).
    foldLeft(0)(_ + _)

  def main(args: Array[String]): Unit = {
    println(ans)
  }
}
