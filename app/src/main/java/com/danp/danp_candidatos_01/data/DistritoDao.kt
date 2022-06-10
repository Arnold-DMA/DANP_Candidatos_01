package com.danp.danp_candidatos_01.data

import androidx.room.*

@Dao
interface DistritoDao {

    @Query("SELECT * FROM DistritoEntity")
    fun getAll(): List<DistritoEntity>

    @Query("SELECT * FROM DistritoEntity WHERE nombre = :nombre")
    suspend fun getByName(nombre: String): DistritoEntity

    @Query("SELECT nombre FROM DistritoEntity")
    fun getNombres(): List<String>

    @Query("SELECT ic_imagen FROM DistritoEntity WHERE nombre = :nombre")
    fun getImage(nombre: String): String

    @Update
    suspend fun update(distrito: DistritoEntity)

    @Insert
    suspend fun insert(distritos: DistritoEntity)

    @Delete
    suspend fun delete(distrito: DistritoEntity)
}