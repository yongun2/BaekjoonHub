import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val heights = IntArray(9) { br.readLine().toInt() }
    val sum = heights.sum()

    // 7명 고르기 = 2명 빼기 → 전체 합 - 두 명 = 100
    var a = 0
    var b = 0
    outer@ for (i in 0 until 9) {
        for (j in i + 1 until 9) {
            if (sum - heights[i] - heights[j] == 100) {
                a = i
                b = j
                break@outer
            }
        }
    }

    val result = heights.filterIndexed { i, _ -> i != a && i != b }.sorted()
    println(result.joinToString("\n"))
}
