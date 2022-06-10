package com.danp.danp_candidatos_01.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DistritoEntity(
    @PrimaryKey
    val nombre: String,
    val altura: String,
    val poblacion: String,
    val superficie: String,
    val descripcion: String,
    val candidatos: String,
    val ic_imagen: String
)
