import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(if (scanner.nextInt() < 10) "true" else "false")
}