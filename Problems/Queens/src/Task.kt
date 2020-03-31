import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x = IntArray(2) { scanner.nextInt() }
    val y = IntArray(2) { scanner.nextInt() }
    println(judge(x, y))
}

fun judge(x: IntArray, y: IntArray): String {
    val z = arrayOf(abs(x[0] - y[0]), abs(x[1] - y[1]))
    if (z[0] == z[1] || z[0] == 0 || z[1] == 0) return "YES"
    return "NO"
}
