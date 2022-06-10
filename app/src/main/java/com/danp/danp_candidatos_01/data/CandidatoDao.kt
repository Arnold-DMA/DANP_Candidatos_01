package com.danp.danp_candidatos_01.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CandidatoDao {

    @Query("SELECT * FROM CandidatoEntity")
    fun getAll(): List<CandidatoEntity>

    @Query("SELECT * FROM CandidatoEntity WHERE distrito = :distrito")
    fun getByDistrito(distrito: String): List<CandidatoEntity>

    @Query("SELECT * FROM CandidatoEntity WHERE nombre = :nombre")
    suspend fun getByName(nombre: String): CandidatoEntity

    @Update
    suspend fun update(candidato: CandidatoEntity)

    @Insert
    suspend fun insert(candidato: CandidatoEntity)

    @Delete
    suspend fun delete(candidato: CandidatoEntity)
}