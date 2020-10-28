/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main(args: Array<String>) {

    val rawData = mapOf (
        "users1.csv" to listOf (32, 45, 17, -1, 34),
        "users2.csv" to listOf (19, -1, 67, 22),
        "users3.csv" to listOf (15, -124, 0, 12),
        "users4.csv" to listOf (56, 32, 18, 44)
    )

    val flatData = rawData.flatMap({ it.value }).filter({ it > 0 })
    val mediaIdade = flatData.sum()/flatData.count()
    //println(flatData)
    //println(mediaIdade)

    val dadosDefeutuosos = rawData.filter({ it.value.any { it <= 0 } }).map({ it.key })
    //println(dadosDefeutuosos)

    val entradasDefeituosas = rawData.flatMap({ it.value }).filter({it <= 0})
    val quantidadeEntradasDefeituosas = entradasDefeituosas.count()
    //println(entradasDefeituosas)
    //println(quantidadeEntradasDefeituosas)
}
