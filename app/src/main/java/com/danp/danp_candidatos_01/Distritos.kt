package com.danp.danp_candidatos_01

object Distritos {
    data class Distrito(val nombre: String, val altura: String, val población: String, val superficie: String, val descripción: String, val candidatos: String, val ic_imagen: kotlin.Int)
    val distritos: List<Distrito> = listOf(
        Distrito("ALTO SELVA ALEGRA", "2500", "86174", "6.98", "Aquí va la  descripción del distrito  de Alto Selva Alegre", "17", R.mipmap.ic_alto_selva_alegre),
        Distrito("CAYMA", "2403", "96009", "246.31", "Aquí va la  descripción del distrito  de Cayma", "16", R.mipmap.ic_cayma)
    )
}