@file:JvmName("JDoodle")
fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0

    val area = lado * lado
    val dobroArea = area * 2

    println("A área do quadrado é: %.2f".format(area))
    println("O dobro da área é: %.2f".format(dobroArea))
}
