fun encode(num: Int): String {
    val numbers = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )
    var numLocal = num;
    var romanNumber = ""

    numbers.forEach { (int, roman) ->
        while (numLocal / int > 0) {
            romanNumber += roman
            numLocal -= int
        }
    }

    return romanNumber;
}

fun main() {
    println(encode(1666) == "MDCLXVI")
    println(encode(2008) == "MMVIII")
}
