package com.danp.danp_candidatos_01.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.danp.danp_candidatos_01.navigation.AppScreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danp.danp_candidatos_01.R

private val provincias = listOf("Arequipa", "Camaná", "Caravelí", "Castilla", "Caylloma", "Condesuyos", "Islay", "La Unión")

@Composable
fun PrimeraVentana(enviarBusqueda:(String) -> Unit){
    var textValue  by remember { mutableStateOf("") }
    var expanded = remember { mutableStateOf(false) }
    var currentValue = remember { mutableStateOf(provincias[0]) }

    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Búsqueda")
        }
    }) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {



            Text(
                text = "Parámetros  de  búsqueda",
                style = TextStyle(color = Color.Black, fontSize = 42.sp, fontWeight = FontWeight.Black)
            )
            
            TextField(
                value = textValue,
                onValueChange = {textValue = it},
                label = {Text("Introducir texto")}
            )
            
            Button(onClick = {enviarBusqueda(textValue)}){
                Text("Buscar")
            }
        }
    }
}
