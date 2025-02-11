@file:JvmName("JDoodle")
fun main() {
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()?.toDoubleOrNull() ?: 0.0

    val celsius = 5 * ((fahrenheit - 32) / 9)

    println("A temperatura em Celsius é: %.2f°C".format(celsius))
}
