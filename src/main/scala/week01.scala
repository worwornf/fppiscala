import scala.annotation.tailrec

object week01 {
  @tailrec
  def factorial(n: Int, f: Int) : Int = if (n == 0) f else factorial(n - 1, f * n)
}
