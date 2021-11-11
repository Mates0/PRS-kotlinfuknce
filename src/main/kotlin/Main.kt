import java.util.*
import kotlin.math.pow

fun main() {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    for (i in 0 until number) {
        if (armstrongNumber(i) == i)
            println(i)
    }
}

fun armstrongNumber(number: Int): Int {
    val length = number.toString().length
    val numberString = number.toString()
    var sum = 0
    for (i in 0 until length) {
        sum += (numberString[i].code - 48).toDouble().pow(length.toDouble()).toInt()
    }
    return sum
}

