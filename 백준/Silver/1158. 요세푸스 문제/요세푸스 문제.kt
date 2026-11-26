import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.collections.isNotEmpty
import kotlin.collections.joinToString

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    
    val q = ArrayDeque<Int>()
    for (i in 1..n) q.addLast(i)
    val res = ArrayList<Int>()
    while (q.isNotEmpty()) {
        repeat(k-1) { q.addLast(q.removeFirst()) }
        res.add(q.removeFirst())
    }
    print(res.joinToString(", ", "<", ">"))

}