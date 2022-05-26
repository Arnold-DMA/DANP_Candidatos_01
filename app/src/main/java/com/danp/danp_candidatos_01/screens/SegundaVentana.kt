package com.danp.danp_candidatos_01.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.danp.danp_candidatos_01.navigation.AppScreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danp.danp_candidatos_01.Candidatos
import com.danp.danp_candidatos_01.Distritos
import com.danp.danp_candidatos_01.Preferencias
import com.danp.danp_candidatos_01.R
import kotlinx.coroutines.launch


@Composable
fun SegundaVentana(text: String, navController: NavController){
    var valor: String
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = Preferencias(context)
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Resultados de búsqueda")
        }
    }) {
        if(text == "Almacenado"){
            val dataDistrito = dataStore.getDistrito.collectAsState(initial = "")
            if (dataDistrito.value == "" || dataDistrito.value == "ninguno"){
                valor = "ninguno";
            }
            else{
                valor = dataDistrito.value;
            }
        }
        else{
            valor = text;
        }
        if(valor == "ALTO SELVA ALEGRA")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "CAYMA")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "CERRO COLORADO")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "JACOBO HUNTER")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "JOSE LUIS BUSTAMANTE Y RIVERO")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "MARIANO MELGAR")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "MIRAFLORES")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "PAUCARPATA")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "SOCABAYA")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else if(valor == "YANAHUARA")
            ListCandidatos(Candidatos.candidatosListASA, navController)
        else
            PaginaBlanca()


    }
}

@Composable
fun ListCandidatos(candidatos: List<Candidatos.Candidato>, navController: NavController) {
    LazyColumn {
        items(candidatos) { candidato->
            llenarCandidatos(candidato = candidato,  navController)
        }
    }
}

@Composable
fun llenarCandidatos(candidato: Candidatos.Candidato, navController: NavController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = Preferencias(context)
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(candidato.ic_candidato),
            contentDescription = candidato.nombre,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        var isExpanded by remember { mutableStateOf(false) }
        val surfaceColor by animateColorAsState(
            if (isExpanded) MaterialTheme.colors.secondary else MaterialTheme.colors.surface,
        )
        Column (modifier = Modifier.width(290.dp).clickable{ isExpanded = !isExpanded }){
            Text(
                text = candidato.nombre,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp,
                color = surfaceColor,
                modifier = Modifier.animateContentSize().padding(1.dp) ) {
                Text(
                    text = candidato.partido+"\n"+
                            "DNI: " + candidato.dni + "\n"+
                            "Población: "+candidato.edad,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2,
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1

                )
            }
        }
        Button(onClick = {navController.navigate(AppScreens.SegundaVentana.createRoute(candidato.nombre))
            scope.launch {
                dataStore.saveNoteCandidato(candidato.nombre)
            }
        },
            modifier = Modifier.fillMaxHeight().width(50.dp).padding(all = 5.dp)){
            Text(">")
        }
    }
}

@Composable
fun PaginaBlanca() {
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


