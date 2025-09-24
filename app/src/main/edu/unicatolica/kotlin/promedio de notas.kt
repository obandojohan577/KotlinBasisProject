package edu.unicatolica.kotlin

fun promedioDeTresNotas(n1: Double, n2: Double, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}

fun main() {
    // = Promedio de 3 asignaturas =
    println("= Promedio de 3 asignaturas =")

    val nota1 = 3.5
    val nota2 = 4.5
    val nota3 = 4.2

    val promedio = promedioDeTresNotas(nota1, nota2, nota3)

    println("Las notas son: $nota1, $nota2, $nota3")
    println("El promedio total es: $promedio")

    if (promedio >= 3.0) {
        println("Resultado: Aprobado ")
    } else {
        println("Resultado: Reprobado ")
    }
}
