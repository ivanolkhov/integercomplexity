import org.scalatest.funsuite.AnyFunSuite

class IntCompTest extends AnyFunSuite {
  test("12345") {
    assert(IntComp.integerComplexity(12345) === 838)
  }
  test("12") {
    assert(IntComp.integerComplexity(12) === 7)
  }
  test("4567") {
    assert(IntComp.integerComplexity(4567) === 4568)
  }
}
