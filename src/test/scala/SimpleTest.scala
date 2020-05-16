import org.scalatest._

class SimpleTest extends FunSuite {
    def sum(a: Int, b: Int): Int = a + b

    test("sum works for 1 + 2 = 3") {
        sum(1, 2) === 3
    }
}
