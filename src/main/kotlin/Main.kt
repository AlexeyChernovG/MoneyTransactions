fun main() {
    val amount = 15.0

    var comission = amount * 0.075

    if (comission < 35) comission = 35.0

    val amountPlusCom = amount + comission

    println("Сумма перевода: " + amount + "р. ")
    println("Комиссия: " + comission)
    println("Итого: " + amountPlusCom)

}