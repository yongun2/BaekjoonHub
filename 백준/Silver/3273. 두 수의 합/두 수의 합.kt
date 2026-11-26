import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    val nums = IntArray(n) { st.nextToken().toInt() }
    val x = br.readLine().toInt()
    val seen = BooleanArray(1000001)

    var result = 0
    for (num in nums) {
        val need = x - num
        if (need in 1..1_000_000 && seen[need]) result++
        seen[num] = true
    }
    println(result)
}