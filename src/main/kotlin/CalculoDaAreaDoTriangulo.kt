/*
Cálcular a área de um triângulo
Área = (base * altura) / 2
a = (b * h) / 2
 */

fun main() {

    println("Cálcular a Área de um Triângulo")
    println("Informe a medida da base:")

    var base:Int = readLine()!!.toInt()

    println("Informe a medida da altura:")

    var altura:Int = readLine()!!.toInt()

    //var areaDoTriangulo = (base * altura)/2
    var areaDoTriangulo = calcularAreaDoTriangulo(base,altura)

    println("A área = $areaDoTriangulo")

}

fun calcularAreaDoTriangulo(base:Int,altura:Int):Int{

    return (base * altura) / 2

}