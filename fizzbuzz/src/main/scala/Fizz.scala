object Fizz {
    def buzz(n: Int): String = n match {
        case n if n % 15 == 0 => "fizzbuzz"
        case n if n % 3 == 0 => "fizz"
        case n if n % 5 == 0 => "buzz"
        case n => n.toString()
    }
}
