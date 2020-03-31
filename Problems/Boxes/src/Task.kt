import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x = IntArray(3) {
        scanner.nextInt()
    }
    val y = IntArray(3) {
        scanner.nextInt()
    }
    x.sortDescending()
    y.sortDescending()
    println(compareBox(x, y))
}

fun compareBox(x: IntArray, y: IntArray): String {
    var flag = true
    for (i in 0..2)
        flag = x[i] == y[i] && flag
    if (flag) return "Box 1 = Box 2"
    flag = true
    for (i in 0..2)
        flag = x[i] >= y[i] && flag
    if (flag) return "Box 1 > Box 2"
    flag = true
    for (i in 0..2)
        flag = x[i] <= y[i] && flag
    if (flag) return "Box 1 < Box 2"
    return "Incomparable"
}