
val discountMaxPercent : Int = 5
val discountMelomaniacPercent : Int = 1
val discountMin :Int = 100
val sumMinDiscount : Int = 1_001
val sumMaxDiscount: Int = 10_001
fun main() {
    discountCalc(1_000, true)
    discountCalc(1_000, false)
    discountCalc(10_000, true)
    discountCalc(10_000, false)
    discountCalc(11_000, true)
    discountCalc(11_000, false)
}

fun discountCalc(sum: Int, isMelomaniac: Boolean) {
    val discount = if (sum >= sumMaxDiscount) {
        sum * discountMaxPercent / 100
    } else if (sum >= sumMinDiscount) {
        discountMin
    } else {
        0
    }
    val sumAfterDiscount: Int = sum - discount
    val extraDiscount: Int = if (isMelomaniac) {
        sumAfterDiscount * discountMelomaniacPercent / 100
    } else {
        0
    }
    val totalDiscount: Int = discount + extraDiscount
    val totalPrice: Int = sum - totalDiscount
    println("Сумма покупки со скидкой: $totalPrice руб., в т.ч. скидка: $totalDiscount руб.")
}


