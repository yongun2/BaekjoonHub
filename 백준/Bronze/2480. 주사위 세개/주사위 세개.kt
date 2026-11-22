fun main() {
    val dice = readln().split(" ").map { it.toInt() }.sorted()

    val prize = when (dice.toSet().size) {
        1 -> 10_000 + dice[0] * 1_000
        2 -> 1_000 + dice[1] * 100   // 정렬하면 짝은 항상 가운데
        else -> dice.last() * 100
    }
    println(prize)

}
