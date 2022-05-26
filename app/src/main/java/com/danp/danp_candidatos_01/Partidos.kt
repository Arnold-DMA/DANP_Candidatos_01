package com.danp.danp_candidatos_01

object Partidos {
    data class Partido(val nombre: String, val descripcion: String, val ic_imagen: kotlin.Int)
    val partidos: List<Partido> = listOf(
        Partido("ACCION POPULAR", "Acción Popular es un partido político peruano fundado el 7 de julio de 1956 por el expresidente Fernando Belaúnde Terry. Es el partido político en actividad que más veces y más tiempo ha ocupado democráticamente la presidencia del Perú.", R.drawable.ic_ap),
        //Partido("ALIANZA PARA EL PROGRESO", "", R.drawable.ic_app),
        Partido("AVANZA PAIS", "Avanza País - Partido de Integración Social es un partido político peruano de derechas. Fue fundado en Santiago de Chuco el 10 de abril de 2000 originalmente de centroizquierda para «seguir la obra de César Vallejo y Alfonso Barrantes Lingán»", R.drawable.ic_pis),
        //Partido("FUERZA POPULAR", "", R.drawable.ic_fp),
        //Partido("JUNTOS POR EL PERU", "", R.drawable.ic_jpp),
        Partido("PARTIDO DEMOCRATICO SOMOS PERU", "El Partido Democrático Somos Perú es un partido político peruano fundado por Alberto Andrade. Cuenta con comités partidarios en diecinueve regiones del país", R.drawable.ic_pdsp),
        //Partido("PARTIDO FRENTE DE LA ESPERANZA 2021", "", R.drawable.ic_pfe),
        Partido("PARTIDO MORADO", "El Partido Morado es considerado como una organización institucionalista, defensora de las reformas política y educativa, progresista en términos sociales y defensora reformista del modelo económico. En su interior coexisten facciones de centroderecha y centroizquierda. En la actualidad, la ideología predominante es el liberalismo moderno, que aboga por la igualdad social junto con un moderado Estado del bienestar.Sin embargo, convive con diferentes filosofías, como la socialdemocracia.", R.drawable.ic_pm),
        //Partido("PARTIDO PATRIOTICO DEL PERU", "", R.drawable.ic_ppp),
        //Partido("PARTIDO POLITICO NACIONAL PERU LIBRE", "", R.drawable.ic_ppnpl),
        //Partido("PODEMOS PERU", "", R.drawable.ic_pp),
        //Partido("RENOVACION POPULAR", "", R.drawable.ic_rp),
        Partido("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "Colectivo de profesionales, líderes sociales y jóvenes técnicos, preocupados por el desarrollo de la región y la " +
                "provincia de Arequipa, lo que buscamos es recuperar la identidad y unidad de nuestra región, " +
                "para aprovechar nuestras ventajas comparativas y competitivas en los recursos naturales, " +
                "culturales e históricos, con los que cuenta nuestro país y región especialmente, que nos permitan " +
                "a través de un gobierno más equitativo, inclusivo y con un profundo corte social mejorar la " +
                "calidad de vida, dentro de una lógica de un desarrollo humano. ", R.drawable.ic_aupegc),
        //Partido("AREQUIPA RENACE", "", R.drawable.ic_ar),
        Partido("AREQUIPA TRANSFORMACION", "Arequipa Transformación es un movimiento regional independiente, cuya propuesta es impulsar las banderas de la región Arequipa, para el logro de las legítimas aspiraciones de desarrollo de sus pueblos.", R.drawable.ic_at),
        Partido("AREQUIPA, TRADICION Y FUTURO", "Arequipa, Tradición y Futuro es una organización política que fue fundada en Arequipa en el año 2005. Arequipa es la segunda región más importante del Perú, con más de un millón trescientos mil habitantes distribuidos en ocho provincias. La ciudad de Arequipa que es la capital de la región es Patrimonio Cultural de la Humanidad desde el año 2000 lo que resulta muy atractivo para el turismo. Además, la región se destaca por sus actividades económicas: minería, comercio, servicios, manufactura y agricultura.", R.drawable.ic_atf),
        Partido("El MOVIMIENTO REGIONAL “FUERZA AREQUIPEÑA” esta conformado por ciudadanos de la región arequipa que buscan el desarrollo sostenido de la misma, sujeto al marco jurídico de nuestra nación.\n" +
                "La denominación MOVIMIENTO REGIONAL “FUERZA AREQUIPEÑA” puede abreviarse con la sigla FA y/o representarse FA contenidas dentro de una casita.", "", R.drawable.ic_fa),
        Partido("JUNTOS POR EL DESARROLLO DE AREQUIPA", "Sin descripción.", R.drawable.ic_jpeda),
        //Partido("MOVIMIENTO REGIONAL AREQUIPA AVANCEMOS", "", R.drawable.ic_mraa),
        Partido("MOVIMIENTO REGIONAL REVALORA", "Sin descripción.", R.drawable.ic_mrr),
        Partido("YO AREQUIPA", "Los cambios se reportaron en la web del Registro de Organizaciones Políticas (ROP), del Jurado Nacional de Elecciones (JNE). En la plataforma también se observa arreglos en el emblema del movimiento regional, que cambió el corazón con el mapa de Arequipa por un pulgar arriba.", R.drawable.ic_ya),
        Partido("FRENTE POPULAR AGRICOLA FIA DEL PERU","EL FRENTE POPULAR AGRICOLA FIA DEL PERU, CUYA SIGLA ES FREPAP, ES UN PARTIDO POLITICO TEOCRATICO CREADO POR EXCELENCIA, BASADO EN LA LEY MORAL EL DECALOGO UNIVERSAL LOS DIEZ MANDAMIENTOS DE LA LEY DE DIOS, FUE FUNDADO EL 30 DE SETIEMBRE DE 1989, POR EL MAESTRO EZEQUIEL ATAUCUSI GAMONAL.", R.drawable.ic_frepap),
        Partido("FE EN EL PERU","El Partido Político se denomina Fe en el Perú, y constituye una organización política democrática, descentralista e innovadora, constituida de acuerdo con la Constitución Política del Perú, la Ley de Partidos Políticos, el Reglamento del Registro de Organizaciones Políticas, la normativa electoral vigente y demás leyes de la República del Perú.", R.drawable.ic_feep)
    )
}