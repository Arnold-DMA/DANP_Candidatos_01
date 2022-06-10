package com.danp.danp_candidatos_01

object Distritos {
    data class Distrito(
        val nombre: String,
        val altura: String,
        val poblacion: String,
        val superficie: String,
        val descripcion: String,
        val candidatos: String,
        val ic_imagen: kotlin.Int)

    val distritos: List<Distrito> = listOf(
        Distrito("ALTO SELVA ALEGRE",
            "2500",
            "86174",
            "6.98",
            "Resalta el Parque Selva Alegre y alrededores, la pureza del aire. Y rápido acceso al cercado en 20 minutos",
            "17",
            R.drawable.ic_alto_selva_alegre),

        Distrito(
                "CAYMA",
            "2403",
            "96009",
            "246.31",
            "Acceso a los centros comerciales Falabella y Metro, Seguridad Garantizada",
            "16", R.drawable.ic_cayma),

        Distrito(
                "CERRO COLORADO",
            "2400",
            "154843",
            "174.9",
            "Encontramos el Aeropuerto, Las canteras de sillas y acceso a recursos alimenticios Terminal Pesquero.",
            "17", R.drawable.ic_cerro_colorado),

        Distrito(
                "JACOBO HUNTER",
            "2302",
            "50544",
            "20.37",
            "Ubicamos el Parque Industrial, Abundante flujo Vehicular de transporte Interprovincial",
            "18", R.drawable.ic_jacobo_hunter),

        Distrito(
                "JOSE LUIS BUSTAMENTE Y RIVERO",
            "2363",
            "80202",
            "10.83",
            "Acceso a Mercado el Avelino, ",
            "20", R.drawable.ic_jlbr),

        Distrito(
                "MARIANO MELGAR",
            "2409",
            "55098",
            "29.83",
            "Acceso al centro historico en 20 minutos, Crecimiento de inversión inmobiliaria",
            "14", R.drawable.ic_mariano_melgar),

        Distrito(
                "MIRAFLORES",
            "2415",
            "50914",
            "28.68",
            "El distrito de Miraflores, Pampa de Miraflores es uno de los 29 distritos que conforman la provincia de Arequipa en el departamento de Arequipa, bajo la administración del Gobierno regional de Arequipa, en el sur del Perú.",
            "17", R.drawable.ic_miraflores),

        Distrito(
                "PAUCARPATA",
            "2410",
            "130420",
            "31.07",
            "Mall de Porongoche, Grupo economico de Sector, aire libre ",
            "20", R.drawable.ic_paucarpata),

        Distrito(
                "SOCABAYA",
            "2287",
            "81651",
            "18.64",
            "Socabaya reconocido por sus tradicionales peleas de toros un atractivo para los turistas",
            "16", R.drawable.ic_socabaya),

        Distrito(
                "YANAHUARA",
            "2343",
            "26662",
            "2.2",
            "Mirador de Yanahuara, Acceso al cercado en 10 minutos.",
            "14", R.drawable.ic_yanahuara),


        )
}