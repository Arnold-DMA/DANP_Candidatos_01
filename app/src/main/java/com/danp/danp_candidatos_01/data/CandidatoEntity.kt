package com.danp.danp_candidatos_01.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.jvm.internal.Intrinsics

@Entity(tableName = "candidato-tb")
data class CandidatoEntity (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")        val id: Int=0,
        @ColumnInfo(name = "partido")   val partido: String,
        @ColumnInfo(name = "nombre")    val nombre:  String,
        @ColumnInfo(name = "dni")       val dni:     String,
        @ColumnInfo(name = "ic_candidato") val ic_candidato: kotlin.Int,
        @ColumnInfo(name = "ic_candidato") val ic_partido: kotlin.Int,
)