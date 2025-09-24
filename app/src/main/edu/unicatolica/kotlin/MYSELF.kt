package edu.unicatolica.kotlin

fun section(title: String) {
    println("\n" + "=".repeat(72))
    println(title)
    println("=".repeat(72))
}

fun aboutMeDemo() {
    section("✓ About Me")

    val name = "Johan"
    val age = 19
    val major = "Ingeniería de Sistemas"
    val skills = listOf("Creativity", "Critical Thinking", "Leadership", "Adaptability")

    val message = "Hi, my name is $name, I am $age years old, I study $major " +
            "and my skills are: ${skills.joinToString(", ")}."

    println(message)
}

fun main() {
    aboutMeDemo()
}
