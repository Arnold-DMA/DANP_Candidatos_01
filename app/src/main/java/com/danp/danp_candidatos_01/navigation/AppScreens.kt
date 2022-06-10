package com.danp.danp_candidatos_01.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppScreens(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object PrimeraVentana: AppScreens("firs_screen", "Selector", Icons.Filled.Search)
    object SegundaVentana: AppScreens("second_screen/?newText={newText}", "Candidatos", Icons.Filled.List){
        fun createRoute(newText: String) = "second_screen/?newText=$newText"
    }
    /*object TerceraVentana: AppScreens("third_screen/?newText={newText}", "Agrupación", Icons.Filled.CheckCircle){
        fun createRoute(newText: String) = "third_screen/?newText=$newText"
    }*/
    object DistritosCRUD: AppScreens("distritos_screen", "CRUD 1", Icons.Filled.Create)
    object CandidatosCRUD: AppScreens("candidatos_screen", "CRUD 2", Icons.Filled.Create)
}
