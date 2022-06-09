package com.danp.danp_candidatos_01

object Candidatos {
    data class Candidato(
        val partido: String,
        val nombre: String,
        val dni: String,
        val edad: String,
        val ic_candidato: kotlin.Int,
        val ic_partido: kotlin.Int)

    val candidatosListASA: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "DAVID ADOLFO BARRIGA MIRANDA", "41448246", "39", R.drawable.ic_atf_dis_01,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ENRIQUE SALAS CARREÑO", "29702231", "47", R.drawable.ic_mrr_dis_01,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "ANIBAL AGUSTIN SALAS FLORES", "29315587", "54", R.drawable.ic_at_dis_01, R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "CRISTHIAN GUILLEN RIVERA", "70464459", "26", R.drawable.ic_fa_dis_01, R.drawable.ic_fa),
        Candidato("FRENTE POPULAR AGRICOLA FIA DEL PERU", "MARIANO OTAZU YANA", "29204070", "80", R.drawable.ic_fpafp_dis_01, R.drawable.ic_frepap),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "HECTOR JESUS DEL CARPIO CAYO", "42313321", "38", R.drawable.ic_ap_dis_01, R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "ALFREDO WILLY BENAVENTE GODOY", "29727520", "47", R.drawable.ic_jda_dis_01, R.drawable.ic_jpeda),
        Candidato("FE EN EL PERU", "RAFAEL VICENTE VILLA MOROCO\n", "29729341", "59", R.drawable.ic_fep_dis_01, R.drawable.ic_feep),
        Candidato("ACCION POPULAR", "DANIEL RICARDO DELGADO QUILLA", "42040127", "39", R.drawable.ic_acpo_dis_01,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "JOSE LUIS NARRO ORTIZ", "40343403", "43", R.drawable.ic_ya_dis_01,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "RAUL LIMA COASACA", "43452732", "36", R.drawable.ic_pm_dis_01,R.drawable.ic_pm),

        )
    val candidatosListCC: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "MANUEL ENRIQUE VERA PAREDES", "06660217", "69", R.drawable.ic_atf_dis_02,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "SANTOS IVAN ALFARO ROJAS", "29539772", "55", R.drawable.ic_mrr_dis_02,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "HUGO EFRAIN AGUILAR GONZALES", "40521048", "42", R.drawable.ic_at_dis_02,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "WALTER BENJAMIN DIAZ PEREZ", "40652616", "42", R.drawable.ic_fa_dis_02,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "MIGUEL ELISEO APAZA PEÑA", "29340598", "58", R.drawable.ic_appis_dis_02,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "HERMES NICOLAS OSCCO POLAR", "40380190", "43", R.drawable.ic_jpa_dis_02,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "PEDRO FLORENCIO HUAMANI ANCASI", "29540821", "56", R.drawable.ic_pdsp_dis_02,R.drawable.ic_pdsp),
        Candidato("FE EN EL PERU", "WILFREDO QUISPE GUTIERREZ", "42262829", "39", R.drawable.ic_fep_dis_02,R.drawable.ic_feep),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "LUIS ELIAS APAZA HUAMAN", "29611996", "48", R.drawable.ic_upegc_dis_02,R.drawable.ic_aupegc),
        Candidato("YO AREQUIPA", "JESUS HERACLIDES TORRES GONZALES", "07511477", "71", R.drawable.ic_ya_dis_02,R.drawable.ic_ya),


        )

    val candidatosListJH: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "ELSA ELENA ACOSTA VARGAS", "30582896", "52", R.drawable.ic_atf_dis_03,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "SERGIO ALFREDO BARRIGA RODRIGUEZ", "01218898", "64", R.drawable.ic_mrr_dis_03,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "LEONARDO JESUS ALVAREZ TICONA", "29625188", "47", R.drawable.ic_at_dis_03,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "DAVID APAZA ENRIQUEZ", "43256408", "37", R.drawable.ic_fa_dis_03,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "CECILIA IMELDA FUENTES GUERRA", "30960650", "45", R.drawable.ic_appis_dis_03,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "CHRISTIAN ALEXANDER ARCE MACHACA", "42030818", "38", R.drawable.ic_jpda_dis_03,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "JIMMY EDGARDO VARGAS ESPINOZA", "29500886", "57", R.drawable.ic_pdsp_dis_03,R.drawable.ic_pdsp),
        Candidato("FE EN EL PERU", "MAGNO LOAYZA AQUINO", "29660942", "48", R.drawable.ic_fep_dis_03,R.drawable.ic_feep),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "HERNAN ALEJANDRO TORRES MEDINA", "80505486", "44", R.drawable.ic_aupegc_dis_03,R.drawable.ic_aupegc),
        Candidato("YO AREQUIPA", "MANUEL ARMANDO CHAVEZ SANCHEZ", "29556253", "53", R.drawable.ic_ya_dis_03,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "JOSE LUIS CARDENAS DELGADO", "44015119", "37", R.drawable.ic_pm_dis_03,R.drawable.ic_pm),

        )

    val candidatosListJBYR: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "RONALD PABLO IBAÑEZ BARREDA", "29255700", "56", R.drawable.ic_atf_dis_04,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "GUILLERMO PABLO REINOSO BARLETTI", "29592519", "49", R.drawable.ic_mrr_dis_04,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "CARLO RAMIRO ALIAGA NUÑEZ", "80263406", "45", R.drawable.ic_at_dis_04,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "DAVID ZAPATA LOVATÓN", "80265605", "42", R.drawable.ic_fa_dis_04,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "ALFREDO HERBERT RAMIREZ MARRON", "29407712", "54", R.drawable.ic_appdis_dis_04,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "JIMMY RENZO OJEDA ARNICA", "41365233", "39", R.drawable.ic_jpda_dis_04,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "CESAR MARIO FLORES YTUSACA", "29718919", "47", R.drawable.ic_pdsp_dis_04,R.drawable.ic_pdsp),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "RAUL MIGUEL ROBLES BORDA", "40733379", "43", R.drawable.ic_upegc_dis_04,R.drawable.ic_aupegc),
        Candidato("ACCION POPULAR", "JULIO ERNESTO FEDERICO ZEGARRA POLAR", "29719619", "55", R.drawable.ic_ap_dis_04,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "SHIRLEY ELBA ALCOCER PAUCA", "29720029", "45", R.drawable.ic_ya_dis_04,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "GONZALO BRICEÑO LIRA", "47630068", "30", R.drawable.ic_pm_dis_04,R.drawable.ic_pm),

        )

    val candidatosListMM: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "SERGIO GONZALES APAZA", "80263302", "42", R.drawable.ic_atf_dis_05,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "DINA KATHERINE REYNOSO CHACON", "46812048", "30", R.drawable.ic_mrr_dis_05,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "CARLOS ALBERTO CHAIÑA LIPA", "40739475", "41", R.drawable.ic_at_dis_05,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "OSCAR ALFREDO AYALA ARENAS", "29384615", "54", R.drawable.ic_fa_dis_05,R.drawable.ic_fa),
        Candidato("FRENTE POPULAR AGRICOLA FIA DEL PERU", "JOSE MAQUERA TORRES", "29613308", "49", R.drawable.ic_fpafp_dis_05,R.drawable.ic_frepap),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "CARLOS ALEJANDRO ANDRADE PAREJA", "29565509", "52", R.drawable.ic_jpda_dis_05,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "ROBERTO CARLO MOLINA DIAZ", "29549400", "52", R.drawable.ic_pdsp_dis_05,R.drawable.ic_pdsp),
        Candidato("ACCION POPULAR", "ANGEL GERARDO ESQUIVEL QUISPE", "29363450", "58", R.drawable.ic_ap_dis_05,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "JAIRD JOHN ORTIZ MEDINA", "41646314", "39", R.drawable.ic_ya_dis_05,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "EFRAIN HERNAN ENRIQUEZ PEREZ", "29276544", "61", R.drawable.ic_pm_dis_05,R.drawable.ic_pm),

        )

    val candidatosListM: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "GERMAN TORRES CHAMBI", "44203837", "58", R.drawable.ic_atf_dis_06,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ABISAIT BRAHIM PACHAO LOVON", "80608045", "43", R.drawable.ic_mrr_dis_06,R.drawable.ic_mrr),
        Candidato("FUERZA AREQUIPEÑA", "MARCO ANTONIO CENTTY LOPEZ", "29624367", "47", R.drawable.ic_fa_dis_06,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "LUIS CARMELO VACA TAYA", "80215135", "42", R.drawable.ic_appdis_dis_06,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "PERCY ALEX BELLIDO REYES", "29625415", "48", R.drawable.ic_jpda_dis_06,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "JOSE ROBERTO ROQUE QUISPE", "29415251", "49", R.drawable.ic_pdsp_dis_06,R.drawable.ic_pdsp),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "MERCEDES AURORA LLAJARUNA MORETO", "29693054", "50", R.drawable.ic_aupegc_dis_06,R.drawable.ic_aupegc),
        Candidato("ACCION POPULAR", "JIM ROBERT CAMA HUARICALLO", "29734053", "43", R.drawable.ic_ap_dis_06,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "GIOVANNA ESTEFANIA CORDOVA ALVIZ", "29414118", "50", R.drawable.ic_ya_dis_06,R.drawable.ic_ya),

        )
    val candidatosListP: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "MARCO ANTONIO ANCO HUARACHI", "40068755", "44", R.drawable.ic_atf_dis_07,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ALVARO RICHARD CARI CHOQUECOTA", "40978973", "40", R.drawable.ic_mrr_dis_07,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "RAUL GREGORIO CHARA CHAMBI", "29605934", "49", R.drawable.ic_at_dis_07,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "FRANKLIN MAXON VALDIVIA CHAVEZ", "43270821", "36", R.drawable.ic_fa_dis_07,R.drawable.ic_fa),
        Candidato("FRENTE POPULAR AGRICOLA FIA DEL PERU", "ESTEBAN LLACCHUA SEGOVIA", "29634749", "51", R.drawable.ic_fpafp_dis_07,R.drawable.ic_frepap),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "JUAN DAVID CHAVEZ FARFAN", "29667123", "47", R.drawable.ic_appdis_dis_07,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "EDWIN WILLY VILCA MAMANI", "44030684", "36", R.drawable.ic_jpeda_dis_07,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "ANGEL DAVID CONDORI", "29735093", "44", R.drawable.ic_pdsp_dis_07,R.drawable.ic_pdsp),
        Candidato("FE EN EL PERU", "ALVARO FLORENCIO ROJAS CHAVEZ", "29608578", "48", R.drawable.ic_feep_dis_07,R.drawable.ic_feep),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "FLOR DEL ROSARIO EDUARDO CUADROS", "29648485", "47", R.drawable.ic_aupegc_dis_07,R.drawable.ic_aupegc),
        Candidato("ACCION POPULAR", "JOSE FELIPE MANRIQUE SALAS", "29270596", "77", R.drawable.ic_ap_dis_07,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "ANTONIO ZAVALA VEGA", "29543719", "58", R.drawable.ic_ya_dis_07,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "FRANK PETER SALCEDO VENERO", "44109588", "35", R.drawable.ic_pm_dis_07,R.drawable.ic_pm),

        )

    val candidatosListS: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "JUAN CARLOS ORTIZ VILLALTA", "29632990", "48", R.drawable.ic_atf_dis_08,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ROMULO FREDDY TERAN TRIGOSO SOTO", "29548785", "52", R.drawable.ic_mrr_dis_08,R.drawable.ic_mrr),
        Candidato("FUERZA AREQUIPEÑA", "ALEXI GUILLERMO RIVERA CANO", "29498641", "58", R.drawable.ic_fa_dis_08,R.drawable.ic_fa),
        Candidato("FRENTE POPULAR AGRICOLA FIA DEL PERU", "ZACARIAS PFOCCORI PUMACALLAHUE", "29455118", "66", R.drawable.ic_fpafdp_dis_08,R.drawable.ic_frepap),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "GLISSOLYM SOLEDAD MONTAÑO CONDORI", "41592270", "39", R.drawable.ic_pdsp_dis_08,R.drawable.ic_pdsp),
        Candidato("FE EN EL PERU", "PEDRO JESUS FUENTES LOPEZ", "29635728", "48", R.drawable.ic_feep_dis_08,R.drawable.ic_feep),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "CEFERINO ADOLFO TICONA PILCO", "29496853", "57", R.drawable.ic_aupegc_dis_08,R.drawable.ic_aupegc),
        Candidato("ACCION POPULAR", "JORGE LUIS JOVE MANRIQUE", "70414588", "28", R.drawable.ic_ap_dis_08,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "ROMEL MIGUEL MEDINA ROMERO PAREDES", "29419186", "60", R.drawable.ic_ya_dis_08,R.drawable.ic_ya),
    )



    val candidatosListC: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "OSWALDO ALVARO MUÑIZ HUILLCA", "29292312", "56", R.drawable.ic_atf_dis_09,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "RONAL ISAIAS QUISPE TACO", "41669932", "38", R.drawable.ic_mrr_dis_09,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "MIRIAM JANET PACHECO DE CARPIO", "29300274", "60", R.drawable.ic_at_dis_09,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "MOISES JESUS CHUCTAYA HUARCA", "29723036", "44", R.drawable.ic_fa_dis_09,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "GINO HECTOR BRAVO ARDILES", "09273706", "58", R.drawable.ic_appis_dis_09,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "RODOLFO AQUEPUCHO HACHA", "29316897", "62", R.drawable.ic_jpedda_dis_09,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "JUAN CARLOS CALLACONDO VELARDE", "01315979", "51", R.drawable.ic_pdsp_dis_09,R.drawable.ic_pdsp),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "JOSE RENATO CARREON ECHEGARAY", "29554296", "50", R.drawable.ic_aupegc_dis_09,R.drawable.ic_aupegc),
        Candidato("YO AREQUIPA", "DOLORES VIRGINIA RODRIGUEZ ACOSTA", "29675617", "60", R.drawable.ic_ya_dis_09,R.drawable.ic_ya),


        )

    val candidatosListY: List<Candidato> = listOf(
        Candidato("AREQUIPA, TRADICION Y FUTURO", "ERNESTO JESUS MONTOYA MOGROVEJO", "29722699", "64", R.drawable.ic_atf_dis_10,R.drawable.ic_atf),
        Candidato("MOVIMIENTO REGIONAL REVALORA", "ALDO ALONSO FRANCO SALINAS", "44342479", "35", R.drawable.ic_mrr_dis_10,R.drawable.ic_mrr),
        Candidato("AREQUIPA TRANSFORMACION", "SERGIO JAVIER BOLLIGER MARROQUIN", "29368863", "55", R.drawable.ic_at_dis_10,R.drawable.ic_at),
        Candidato("FUERZA AREQUIPEÑA", "MANUEL JAVIER VERA FALCONI", "29688869", "45", R.drawable.ic_fa_dis_10,R.drawable.ic_fa),
        Candidato("AVANZA PAIS - PARTIDO DE INTEGRACION SOCIAL", "FIAMA TRIPSY AMARA GUTIERREZ LINARES", "47831348", "30", R.drawable.ic_appis_dis_10,R.drawable.ic_pis),
        Candidato("JUNTOS POR EL DESARROLLO DE AREQUIPA", "JOLWER ALBERTO LOPEZ ZUÑIGA", "29726623", "44", R.drawable.ic_jpedda_dis_10,R.drawable.ic_jpeda),
        Candidato("PARTIDO DEMOCRATICO SOMOS PERU", "JOSE AUGUSTO ARCE PAREDES\n", "45839518", "32", R.drawable.ic_pdsp_dis_10,R.drawable.ic_pdsp),
        Candidato("AREQUIPA - UNIDOS POR EL GRAN CAMBIO", "EUSEBIO ANCALLE LLAMOCCA", "30949946", "54", R.drawable.ic_upegc_dis_10,R.drawable.ic_aupegc),
        Candidato("ACCION POPULAR", "PILAR TERESA VERA MADARIAGA", "02433416", "48", R.drawable.ic_ap_dis_10,R.drawable.ic_ap),
        Candidato("YO AREQUIPA", "LUIS ALONSO ORTIZ PERALTA MURILLO", "42732993", "37", R.drawable.ic_ya_dis_10,R.drawable.ic_ya),
        Candidato("PARTIDO MORADO", "GONZALO ALVARO ALVARADO BUSTAMANTE", "29521114", "56", R.drawable.ic_pm_dis_10,R.drawable.ic_pm),

        )


}