fun main() {
    print("Digite a temperatura em Celsius: ")
    val celsius = readLine()?.toDoubleOrNull() ?: 0.0

    val fahrenheit = (celsius * 9 / 5) + 32

    println("A temperatura em Fahrenheit é: %.2f°F".format(fahrenheit))
}
