package functionalprogrammingtest

import functionalprogramming.P02
import org.scalatest.FunSuite

class P02Test extends FunSuite {
  test("P2.penultimate") {
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)

    assert(P02.lastNthRecursive(3, List(1, 1, 2, 3, 5, 8)) === 3)
  }
}