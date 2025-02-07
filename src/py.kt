fun calculateCommission(
    cardType: String = "VK Pay",
    previousTransfers: Double = 0.0,
    currentTransfer: Double
): String {
    val freeLimit = 15000.0

    return when (cardType) {
        "VK Pay" -> {
            "Комиссия: 0 рублей"
        }
        "MasterCard", "Maestro" -> {
            if (previousTransfers + currentTransfer <= freeLimit) {
                "Комиссия: 0 рублей"
            } else {
                val commission = (currentTransfer * 0.006) + 20
                "Комиссия: ${"%.2f".format(commission)} рублей"
            }
        }
        else -> "Некорректный тип карты"
    }
}
fun main() {
    println(calculateCommission("VK Pay", 0.0, 5000.0)) // Комиссия: 0 рублей
    println(calculateCommission("MasterCard", 10000.0, 4000.0)) // Комиссия: 0 рублей
    println(calculateCommission("Maestro", 16000.0, 2000.0)) // Комиссия: 32.00 рублей
    println(calculateCommission("MasterCard", 12000.0, 5000.0)) // Комиссия: 32.00 рублей
}