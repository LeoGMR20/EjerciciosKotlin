package collatzConjecture

fun main() {
    val i = verifyValue()
    var j = verifyValue()
    
    val collaztL = collatzLenght(i,j)

    println(collaztL)
}

fun collatzLenght(i: Int, j: Int): Int {
    val lenghts: ArrayList<Int> = ArrayList()
    for (cont in i..j) {
        lenghts.add(collatz(cont))
    }
    return lenghts.max()
}

fun collatz(cont: Int): Int {
    var num = cont
    var lenght = 1
    while (num > 1){
        if (num % 2 == 0) num /= 2 else num = (3 * num) + 1
        lenght++
    }
    return lenght
}

fun verifyValue(): Int{
    var n: Int
    do n = readln().toInt() while (n <= 0 || n >= 10000)
    return n
}