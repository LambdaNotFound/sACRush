package functionalprogrammingtest

import functionalprogramming.P01
import org.scalatest.FunSuite

class P01Test extends FunSuite {
  test("P1.last") {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }
}