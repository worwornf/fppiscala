import org.scalatest.FunSuite

/**
 * Created by key on 2015-04-28.
 */
class week01Test extends FunSuite {

  test("factorial 5 == 120") {
    assert(week01.factorial(5, 1) == 120)
  }

}
