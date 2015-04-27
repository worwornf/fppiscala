import scala.util.Random

def sort(xs : Array[Int]) : Array[Int] = {
  if (xs.length <= 1) {
    xs
  } else {
    val pivot = xs(xs.length / 2)
    Array.concat(
      sort(xs filter (pivot >)),
        xs filter (pivot ==),
      sort(xs filter (pivot <))
    )
  }
}
sort(Seq.fill(100)(Random.nextInt(100)).toArray).foreach(x=>print (" " + x))
sort((1 to 100).toArray).mkString(" ")
// CBV vs CBN
def loop : Int = loop
def constOnt(x:Int, y: => Int) = 1
constOnt(1, loop)
//constOnt(loop, 1) //infinite loop

def abs(x: Double): Double = if (x < 0) -x else x

def square(x: Double) : Double = x * x

def sqrt(x: Double): Double = {
  def isGoodEnough(guess: Double): Boolean =
    abs(square(guess) - x) / x < 0.001

  def improve(guess: Double) : Double =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double): Double = {
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))
  }

  sqrtIter(1.0)
}

sqrt(1e10)

println(1e3)
def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
gcd(14, 21)
def gcf(a: Int, b: Int): Int = a * b / gcd(a, b)
gcf(14, 21)

