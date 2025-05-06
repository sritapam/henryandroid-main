package com.henryandroid.kotlin.tareas.kotlin2

//Implementá:
//
//Un constructor primario.
//
//Un constructor secundario.
//
//Usá un bloque init para inicializar valores.
//
//Aplicá modificadores de acceso: private, public y protected.

class Animal (
    private val species: String,
    val name: String
) {
    private var sound: String = "desconocido"

    constructor(species: String, name: String, sound: String) : this(species, name){
        this.sound = sound
    }

    init {
        announceCreation()
    }

    fun makeSound() {
        println("El animal $species $name hace un sonido que es $sound")
    }

    private fun announceCreation() {
        println("Se ha creado un $species llamado $name")
    }

    protected fun changeSound(newSound: String) {
        sound = newSound
    }
}