import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val grade = when (br.readLine().toInt()) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        in 60 .. 69 -> "D"
        else -> "F"
    }
    
    print(grade)
}
