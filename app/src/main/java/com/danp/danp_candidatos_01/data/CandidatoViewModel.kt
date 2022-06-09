package com.danp.danp_candidatos_01.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.danp.danp_candidatos_01.Candidatos
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CandidatoViewModel(application:Application):AndroidViewModel(application) {

    val candidatosTodos: LiveData<List<CandidatoEntity>>
    private val candidatoRepo:CandidatoRepository

    init{
        val userDao = CandidatoBaseDatos.obtenerBaseDatos(
            application
        ).candidatoDao()
        candidatoRepo = CandidatoRepository(userDao)
        candidatosTodos = candidatoRepo.obtenerTodo
    }

    fun agregarCandidato(candidato: CandidatoEntity){
        viewModelScope.launch(Dispatchers.IO) {
            candidatoRepo.agregarCandidato(candidato)
        }
    }

}