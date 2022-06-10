package com.danp.danp_candidatos_01.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [DistritoEntity::class, CandidatoEntity::class],
    version = 1
)
abstract class EleccionesDataBase : RoomDatabase() {

    abstract fun distritoDao(): DistritoDao
    abstract fun candidatoDao(): CandidatoDao
}