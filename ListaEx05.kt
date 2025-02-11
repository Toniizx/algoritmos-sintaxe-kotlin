
@file:JvmName("JDoodle")
fun main() {
    print("Digite um número em metros: ")
    val num1 = readLine()?.toIntOrNull() ?: 0  

    val media = (num1 ) *100 
    println("O número em centimetros é de: $media cm" )
}