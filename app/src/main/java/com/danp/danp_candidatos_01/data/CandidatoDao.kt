package com.danp.danp_candidatos_01.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CandidatoDao {
    @Query("SELECT * FROM `candidato-tb`")
    fun obtenerTodosCandidatos():LiveData<List<CandidatoEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarCandidato(candidato: CandidatoEntity)
}