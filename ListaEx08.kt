@file:JvmName("JDoodle")
fun main() {
    print("Quanto você ganha por hora? ")
    val valorPorHora = readLine()?.toDoubleOrNull() ?: 0.0

    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()?.toDoubleOrNull() ?: 0.0

    val salario = valorPorHora * horasTrabalhadas

    println("O seu salário no mês é: R$ %.2f".format(salario))
}