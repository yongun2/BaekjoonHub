import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    // count[학년][성별] = 인원 수
    val count = Array(6) { IntArray(2) }
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val gender = st.nextToken().toInt()
        val grade = st.nextToken().toInt()
        count[grade - 1][gender]++
    }

    // 칸마다 필요한 방 수 = 인원을 k로 나눈 값의 올림
    val rooms = count.sumOf { row -> row.sumOf { (it + k - 1) / k } }
    println(rooms)
}
