package com.danp.danp_candidatos_01.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danp.danp_candidatos_01.Partidos
import com.danp.danp_candidatos_01.Preferencias


@Composable
fun TerceraVentana(text: String, navController: NavController){
    var valor: String
    val context = LocalContext.current
    val dataStore = Preferencias(context)
    var partido: Partidos.Partido
    val partidos: List<Partidos.Partido> = Partidos.partidos;
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Partido/Agrupación Político(a)")
        }
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (text == "vacio") {
                val dataPartido = dataStore.getCandidato.collectAsState(initial = "")
                if (dataPartido.value == "" || dataPartido.value == "ninguno") {
                    valor = "ninguno";
                } else {
                    valor = dataPartido.value;
                }
            } else {
                valor = text;
            }
            if(valor != "ninguno"){
                LazyColumn {
                    items(partidos) { partido->
                        if(partido.nombre == valor){
                            llenarCartilla(partido)
                        }
                    }
                }
            }
            else{
                PaginaVacia()
            }
        }
    }
}

@Composable
fun PaginaVacia() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Nada que mostrar",
            style = TextStyle(color = Color.Black, fontSize = 42.sp, fontWeight = FontWeight.Black)
        )
    }
}

@Composable
fun llenarCartilla(partido: Partidos.Partido) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(partido.ic_imagen),
            contentDescription = partido.nombre,
            modifier = Modifier.padding(all = 20.dp)
                .clip(RoundedCornerShape(50.dp))
                .border(1.5.dp, MaterialTheme.colors.onPrimary, RoundedCornerShape(10.dp))
        )
        Text(
            text = partido.nombre,
            style = TextStyle(color = Color.Black, fontSize = 42.sp, fontWeight = FontWeight.Black)
        )
        Text(
            text = partido.descripcion,
            style = TextStyle(color = Color.Gray, fontSize = 21.sp, fontWeight = FontWeight.Medium)
        )
    }
}
