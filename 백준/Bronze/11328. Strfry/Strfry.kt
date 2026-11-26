import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()                      
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken()
        val b = st.nextToken()

        val count = IntArray(26)
        for (ch in a) count[ch - 'a']++
        for (ch in b) count[ch - 'a']--

        val possible = count.all { it == 0 }      
        sb.append(if (possible) "Possible" else "Impossible").append('\n')
    }
    print(sb)
}