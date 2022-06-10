package com.danp.danp_candidatos_01.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.jvm.internal.Intrinsics

@Entity
data class CandidatoEntity (
        @PrimaryKey
        val nombre: String,
        val distrito: String,
        val partido: String,
        val dni: String,
        val edad: String,
        val ic_candidato: String,
        val ic_partido: String
)