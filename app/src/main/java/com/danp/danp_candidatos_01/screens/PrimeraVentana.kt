package com.danp.danp_candidatos_01.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.danp.danp_candidatos_01.navigation.AppScreens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.danp.danp_candidatos_01.Distritos
import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalContext
import com.danp.danp_candidatos_01.Preferencias
import kotlinx.coroutines.launch


@Composable
fun PrimeraVentana(navController: NavController){

    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Distritos")
        }
    }) {
        ListDistritos(Distritos.distritos, navController)
        
    }
}

@Composable
fun ListDistritos(distritos: List<Distritos.Distrito>, navController: NavController) {
        LazyColumn {
            items(distritos) { distrito->
                llenarDistritos(distrito = distrito,  navController)
            }
        }
}

@Composable
fun llenarDistritos(distrito: Distritos.Distrito, navController: NavController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = Preferencias(context)
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(distrito.ic_imagen),
            contentDescription = distrito.nombre,
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
        Column (modifier = Modifier
            .width(290.dp)
            .clickable { isExpanded = !isExpanded }){
            Text(
                text = distrito.nombre,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp,
                    color = surfaceColor,
                    modifier = Modifier
                        .animateContentSize()
                        .padding(1.dp) ) {
                Text(
                    text = distrito.descripción+"\n"+
                            "Altura: " + distrito.altura + " msnm\n"+
                            "Población: "+distrito.población+" personas\n"+
                            "Superficie: "+distrito.superficie+" km2\n"+
                            "Cantidad de candidatos: "+distrito.candidatos,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2,
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1

                )
            }
        }
        Button(onClick = {navController.navigate(AppScreens.SegundaVentana.createRoute(distrito.nombre))
                         scope.launch {
                             dataStore.saveNoteDistrito(distrito.nombre)
                         }
                         },
                modifier = Modifier
                    .fillMaxHeight()
                    .width(50.dp)
                    .padding(all = 5.dp)){
            Text(">")
        }
    }
}
