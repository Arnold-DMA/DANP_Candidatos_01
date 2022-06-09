package com.danp.danp_candidatos_01.data

import androidx.lifecycle.LiveData

class CandidatoRepository(private val candidatoDao: CandidatoDao) {
    val obtenerTodo: LiveData<List<CandidatoEntity>> = candidatoDao.obtenerTodosCandidatos()

    suspend fun agregarCandidato(candidato: CandidatoEntity){
        candidatoDao.agregarCandidato(candidato)
    }
}