package parking

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val order = Array(2) {scanner.next()}
    val occupied = mutableListOf(true, false)
    var n = 0
    if ("park" == order[0]) {
        val color = scanner.next()
        if (!occupied[0]) {
            occupied[0] = true
            n = 1
        }
        else if (!occupied[1]) {
            occupied[1] = true
            n = 2
        }
        if (n > 0)
            print("$color car parked on the spot $n.")
    }
    else if ("leave" == order[0]) {
        var leaved = false;
        n = 0
        if (order[1] == "1") {
            n = 1
            if (occupied[0]) {
                occupied[0] = false
                leaved = true
            }
        }
        else if (order[1] == "2") {
            n = 2
            if (occupied[1]) {
                occupied[1] = false
                leaved = true
            }
        }
        if (n > 0 && leaved)
            println("Spot $n is free.")
        else
            println("There is no car in the spot $n.")
    }
}
