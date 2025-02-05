fun main() {
    val amount: Double = 35500.0
    val commissionRate = 0.0075
    val minimumCommission = 35.0


    val Commission = amount * commissionRate

    val finalCommission = if (Commission < minimumCommission) minimumCommission else Commission


    println("Сумма перевода: $amount рублей")
    println("Комиссия: $finalCommission рублей")
}