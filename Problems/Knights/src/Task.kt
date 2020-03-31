import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    val n4 = scanner.nextInt()
    if (abs(n1 - n3) == 1 && abs(n2 - n4) == 2) println("YES")
    else if (abs(n1 - n3) == 2 && abs(n2 - n4) == 1) println("YES")
    else println("NO")
}