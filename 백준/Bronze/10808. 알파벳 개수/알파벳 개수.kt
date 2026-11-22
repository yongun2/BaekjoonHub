import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val S = br.readLine()

    val cnt = IntArray(26)
    for (ch in S) {
        cnt[ch - 'a'] += 1
    }

    val sb = StringBuilder()
    cnt.forEach { sb.append(it).append(' ') }
    println(sb)
}