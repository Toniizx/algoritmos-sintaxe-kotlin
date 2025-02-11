@file:JvmName("JDoodle")
fun main() {
    print("Digite o raio de um circulo: ")
    val num1 = readLine()?.toIntOrNull() ?: 0  

    val media = (num1 ) * 3.14 * 10
    println("A área do circulo é de: $media" )
}