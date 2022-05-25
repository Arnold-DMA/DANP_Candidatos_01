package com.danp.danp_candidatos_01

object Candidatos {
    data class Candidato(val partido: String, val nombre: String, val dni: String, val edad: String, val ic_candidato: kotlin.Int)
    val candidatosListASA: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "DAVID ADOLFO BARRIGA MIRANDA", "41448246", "39", R.mipmap.ic_atf_dis_01),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ENRIQUE SALAS CARREÑO", "29702231", "47", R.mipmap.ic_mrr_dis_01)
    )
}