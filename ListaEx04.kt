@file:JvmName("JDoodle")
fun main() {
    print("Digite uma nota bimestral: ")
    val num1 = readLine()?.toIntOrNull() ?: 0  

    print("Digite uma nota bimestral: ")
    val num2 = readLine()?.toIntOrNull() ?: 0  
    
    print("Digite uma nota bimestral: ")
    val num3 = readLine()?.toIntOrNull() ?: 0 
    
    print("Digite uma nota bimestral: ")
    val num4 = readLine()?.toIntOrNull() ?: 0 

    val media = (num1 + num2 + num3 + num4) / 4
    println("A media bimestral é de: $media")
}