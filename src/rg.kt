fun agoToText(seconds: Int): String {
    return when {
        seconds < 60 -> "был(а) в сети только что"
        seconds < 3600 -> "был(а) в сети ${seconds / 60} минут${if ((seconds / 60) % 10 == 1 && (seconds / 60) % 100 != 11) "у" else "ы"} назад"
        seconds < 86400 -> "был(а) в сети ${seconds / 3600} час${if ((seconds / 3600) % 10 == 1 && (seconds / 3600) % 100 != 11) " назад" else "а назад"}"
        seconds < 172800 -> "был(а) в сети вчера"
        seconds < 259200 -> "был(а) в сети позавчера"
        else -> "был(а) в сети давно"
    }
}
fun main() {
    println(agoToText(30))         // "был(а) только что"
    println(agoToText(120))        // "был(а) 2 минуты назад"
    println(agoToText(3600))       // "был(а) 1 час назад"
    println(agoToText(7200))       // "был(а) 2 часа назад"
    println(agoToText(86400))      // "вчера"
    println(agoToText(172800))     // "позавчера"
    println(agoToText(259200))     // "давно"
}