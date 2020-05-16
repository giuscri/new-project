import org.scalatest._

class FizzTest extends FunSuite {
  test("fizzBuzz for 4 is 4") {
    Fizz.buzz(4) === "4"
  }
}
