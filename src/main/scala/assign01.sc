def pascal(c: Int, r: Int): Int = 1

def balance(chars: List[Char]): Boolean = {
//  def empty(): Boolean =
//   chars.count(_ == '(') == 0 && chars.count(')' ==) == 0
//
//  empty() ||
//     chars.count(_ == '(') == chars.count(')' ==) &&
//     chars.indexOf('(') < chars.indexOf(')') &&
//     chars.lastIndexOf('(') < chars.lastIndexOf(')')
}
assert(balance("empty".toList))
assert(balance("(if (zero? x) max (/ 1 x))".toList))
assert(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
assert(balance(":-)".toList) == false)
assert(balance("())(".toList) == false)
assert(balance(")(()".toList) == false)

def countChange(money: Int, coins: List[Int]): Int = 1
