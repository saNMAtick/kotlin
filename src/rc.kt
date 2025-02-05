fun main() {
    val purchaseAmount: Double = 15000.0
    val isRegularCustomer: Boolean = false
    var discount: Double = 0.0

    when {
        purchaseAmount in 0.0..1000.0 -> discount = 0.0
        purchaseAmount in 1001.0..10000.0 -> discount = 100.0
        else -> discount = purchaseAmount * 0.05
    }

    if (isRegularCustomer) {
        discount += (purchaseAmount - discount) * 0.01
    }

    val finalAmount = purchaseAmount - discount

    println("Сумма покупки: $purchaseAmount рублей")
    println("Размер скидки: $discount рублей")
    println("Итоговая сумма после скидки: $finalAmount рублей")
}