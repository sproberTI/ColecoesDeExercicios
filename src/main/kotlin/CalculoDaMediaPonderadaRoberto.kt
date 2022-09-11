/**
 * Este programa cálcula a média ponderada
 * entre três valores
 * nota1, nota2, nota3
 * peso1, peso2, peso3
 * peso1 = 2
 * peso2 = 3
 * peso3 = 4
 *
 * mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1+peso2+peso3)
 *
 */

fun main() {

    val peso1:Int = 2
    val peso2:Int = 3
    val peso3:Int = 4

    println("Digite a primeira nota:")
    val nota1:Double = readLine()!!.toDouble()

    println("Digite a segunda nota:")
    val nota2:Double = readLine()!!.toDouble()

    println("Digite a terceira nota:")
    val nota3:Double = readLine()!!.toDouble()

    var mediaPonderada = calcularMediaPonderada(nota1,nota2,nota3,peso1,peso2,peso3)

    println("Média Ponderada Calculada: $mediaPonderada")

}

fun calcularMediaPonderada(nota1:Double,nota2:Double,nota3:Double,peso1:Int,peso2:Int,peso3:Int):Double{

    var mediaPonderada =
        ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3)

    return mediaPonderada
}

fun mostrarResultado(mediaPonderada:Double){

    return println("Média Ponderada Calculada: $mediaPonderada")
}

