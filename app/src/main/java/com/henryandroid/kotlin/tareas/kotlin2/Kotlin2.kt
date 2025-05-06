package com.henryandroid.kotlin.tareas.kotlin2

import java.io.ObjectInputValidation

class Kotlin2 {
    
    // 1. Declaración y uso de funciones básicas
    fun greet(name: String) {
        // TODO: Imprimir "Hola, {name}!" usando println
        println("Hola, $name!")
    }

    fun add(a: Int, b: Int): Int {
        // TODO: Retornar la suma de a y b
        return a + b
    }

    // 2. Funciones inline y de una sola expresión
    inline fun multiply(a: Int, b: Int) = a * b
    
    //fun square(n: Int) = n * n // TODO: Convertir esta función a una expresión de una sola línea

    val square: (Int) -> Int = { n -> n * n }
    val square2: (Int) -> Int = { it * it }
    
    // 3. Introducción a lambdas y funciones de orden superior
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)

        // TODO: Usar map para duplicar los valores de numbers y almacenarlo en una nueva lista
        val doubledNumbers = numbers.map { it * 2 }
        println("Números duplicados: $doubledNumbers")

        // TODO: Usar filter para obtener solo los números pares
        val pairNumbers = numbers.filter { it % 2 == 0 }
        println("Números pares: $pairNumbers")
    }

    // 4. Clases y objetos
    class Person(private val name: String, private var age: Int) {
        // TODO: Agregar un método que imprima "Soy {name} y tengo {age} años"

        fun presentation() {
            println("Soy $name y tengo $age años")
        }
    }

    // 5. Constructores y datos encapsulados
    class Car(val brand: String, val model: String, val year: Int) {
        init {
            // TODO: Imprimir "Auto creado: {brand} {model} del año {year}"
            initialize()
        }

       private fun initialize() {
            println("Auto creado: $brand $model del año $year")
        }
    }

    // Consignas de HW1
    // Creá una función que tenga parámetros opcionales.

    fun entry(a: Int, name: String = "Invitado") {
        println("Hola $name, tu edad es $a")
    }

    // Consignas de HW2
    //Creá una función de orden superior que reciba otra función como parámetro.

    fun reserveIfAllowed(age: Int, validation: (Int) -> Boolean) {
        if (validation(age)) {
            println("Acceso permitido")
        } else {
            println("Acceso denegado")
        }
    }

    fun main() {
        // Llamar a las funciones de prueba
        greet("Gaston")
        println("Suma: ${add(3, 5)}")
        println("Multiplicación: ${multiply(4, 2)}")
        println("Cuadrado: ${square(6)}")
        lambdaExample()

        // Creación de objetos y uso de clases
        val person = Person("Juan", 30)
        val person2 = Person("Roxana", 38)

        // TODO: Llamar al método que imprime la información de la persona
        person.presentation()
        person2.presentation()

        val car = Car("Toyota", "Corolla", 2022)
        entry(25)
        entry(25, "Pamela")
        reserveIfAllowed(25) { it >= 18 }
        reserveIfAllowed(17) { it >= 18 }

        val animal = Animal("Perro", "Lola")
        animal.name
        animal.makeSound()

        val animal2 = Animal("Gato", "Luna", "miau")
        animal2.name
        animal2.makeSound()
    }
}

fun main(){
    val ejercicios = Kotlin2()
    ejercicios.main()
}
