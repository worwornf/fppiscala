def pascal(c: Int, r: Int): Int = {
  if (c == 0 || c == r) return 1
  else {
    pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}

assert(pascal(0, 2) == 1)
assert(pascal(1, 2) == 2)
assert(pascal(1, 3) == 3)

def balance(chars: List[Char]): Boolean = {
  def loop(body: List[Char], count: Int): Boolean = {
    if (count < 0) {
      false
    } else if (body.isEmpty) {
      count == 0
    } else {
      val head = body.head
      if (head == '(') loop(body.tail, count + 1)
      else if (head == ')') loop(body.tail, count - 1)
      else loop(body.tail, count)
    }
  }
  loop(chars, 0)
}
assert(balance("empty".toList))
assert(balance("(if (zero? x) max (/ 1 x))".toList))
assert(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
assert(balance(":-)".toList) == false)
assert(balance("())(".toList) == false)
assert(balance(")(()".toList) == false)

def countChange(money: Int, coins: List[Int]): Int = {
  if (coins.isEmpty) return 0

  val head = coins.head
  if (money == head) {
    1
  } else if (money > head) {
    countChange(money - head, coins) + countChange(money, coins.tail)
  } else {
    0
  }
}

assert(countChange(4, List(1, 2)) == 3, countChange(4, List(1, 2)))