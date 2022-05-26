package com.danp.danp_candidatos_01.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.danp.danp_candidatos_01.navigation.AppScreens.*
import com.danp.danp_candidatos_01.screens.PrimeraVentana
import com.danp.danp_candidatos_01.screens.SegundaVentana
import com.danp.danp_candidatos_01.screens.TerceraVentana


@Composable
fun AppNavigation(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = PrimeraVentana.route) {
        composable(route = PrimeraVentana.route) {
            PrimeraVentana(navController)
        }
        composable(
            route = SegundaVentana.route,
            arguments = listOf(navArgument("newText"){defaultValue = "Almacenado"})
        ) { navBackStackEntry->
            var newText = navBackStackEntry.arguments?.getString("newText")
            requireNotNull(newText)
            SegundaVentana(newText, navController)
        }

        composable(
            route = TerceraVentana.route,
            arguments = listOf(navArgument("newText"){defaultValue = "vacio"})
        ) { navBackStackEntry->
            var newText = navBackStackEntry.arguments?.getString("newText")
            requireNotNull(newText)
            TerceraVentana(newText, navController)
        }

    }
}