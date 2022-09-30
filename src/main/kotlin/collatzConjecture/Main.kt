package collatzConjecture

fun main() {
    val i: Int
    val j: Int

    i = verifyValue()
    j = verifyValue()

    
}

fun verifyValue(): Int{
    var n: Int
    do n = readln().toInt() while (n <= 0 || n >= 10000)
    return n
}