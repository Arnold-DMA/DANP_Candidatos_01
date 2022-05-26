package com.danp.danp_candidatos_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.danp.danp_candidatos_01.components.BottomNavigationBar
import com.danp.danp_candidatos_01.navigation.AppNavigation
import com.danp.danp_candidatos_01.navigation.AppScreens.*
import com.danp.danp_candidatos_01.ui.theme.DANP_Candidatos_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DANP_Candidatos_01Theme{
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    val navigationItems = listOf(
        PrimeraVentana,
        SegundaVentana,
        TerceraVentana
    )
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController, items = navigationItems)}
    ){
        AppNavigation(navController = navController)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DANP_Candidatos_01Theme {
        MainScreen()
    }
}