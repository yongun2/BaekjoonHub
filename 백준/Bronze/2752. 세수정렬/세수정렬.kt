import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    val intArray = IntArray(3) { st.nextToken().toInt() }
    intArray.sort()
    intArray.forEach {
        sb.append(it).append(' ')
    }
    print(sb)
}
