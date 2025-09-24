package edu.unicatolica.kotlin

fun main() {
    println("Por favor ingrese la primera nota")
    val nota1 = readLine()!!.toDouble()

    println("Por favor ingrese la segunda nota")
    val nota2 = readLine()!!.toDouble()

    println("Por favor ingrese la tercera nota")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    println("El promedio de sus tres asignaturas es: $promedio")
}








