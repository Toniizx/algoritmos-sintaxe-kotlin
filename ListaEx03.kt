@file:JvmName("JDoodle")
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0  

    print("Digite o segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0  

    val soma = num1 + num2
    println("A soma de $num1 e $num2 é: $soma")
}