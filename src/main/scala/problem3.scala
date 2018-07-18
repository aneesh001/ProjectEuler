import scala.annotation.tailrec

object problem3 {
  val num = 600851475143L

  def largestPrimeFactor(n: Long): Long = {
    @tailrec
    def loop(cn: Long, pf: Long, ans: Long): Long = {
      if(pf * pf > cn && cn > 2) math.max(ans, cn)
      else if(pf * pf > cn) ans
      else if(cn % pf == 0) loop(cn / pf, pf, math.max(ans, pf))
      else loop(cn, pf + 1, ans)
    }

    loop(n, 2, 2)
  }

  def main(args: Array[String]): Unit = {
    println(largestPrimeFactor(num))
  }
}
