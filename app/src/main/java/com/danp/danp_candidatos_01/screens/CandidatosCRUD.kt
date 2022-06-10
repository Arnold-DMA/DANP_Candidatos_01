package com.danp.danp_candidatos_01.screens


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.navigation.NavController
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.room.Room
import com.danp.danp_candidatos_01.data.CandidatoEntity
import com.danp.danp_candidatos_01.data.DistritoEntity
import com.danp.danp_candidatos_01.data.EleccionesDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun CandidatosCRUD(navController: NavController){


    val dbs = Room.databaseBuilder(
        LocalContext.current,
        EleccionesDataBase::class.java, "elecciones"
    )

    val scope = rememberCoroutineScope()

    var list = dbs.allowMainThreadQueries().build().distritoDao().getNombres()
    val expanded = remember { mutableStateOf(false) }
    val currentValue = remember { mutableStateOf(list[0]) }

    var partido by remember {mutableStateOf("")}
    var nombre by remember {mutableStateOf("")}
    var dni by remember {mutableStateOf("")}
    var edad by remember {mutableStateOf("")}
    var ic_candidato by remember {mutableStateOf("")}
    var ic_partido by remember {mutableStateOf("")}

    val db = dbs.build()

    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Candidatos CRUD")
        }
    }) {
        //ListDistritos(Distritos.distritos, navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface() {

                Box() {

                    Row(modifier = Modifier
                        .clickable {
                            expanded.value = !expanded.value
                        }
                        .align(Alignment.Center)) {
                        Text(text = currentValue.value)
                        Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = null)


                        DropdownMenu(expanded = expanded.value, onDismissRequest = {
                            expanded.value = false
                        }) {

                            list.forEach {

                                DropdownMenuItem(onClick = {
                                    currentValue.value = it
                                    expanded.value = false
                                }) {

                                    Text(text = it)

                                }

                            }

                        }


                    }

                }
            }

            TextField(
                value = partido,
                onValueChange = {partido = it},
                label = {Text("Partido/Agrupación política")}
            )
            TextField(
                value = nombre,
                onValueChange = {nombre = it},
                label = {Text("Nombre")}
            )
            TextField(
                value = dni,
                onValueChange = {dni = it},
                label = {Text("DNI")}
            )
            TextField(
                value = edad,
                onValueChange = {edad = it},
                label = {Text("Edad")}
            )
            TextField(
                value = ic_candidato,
                onValueChange = {ic_candidato = it},
                label = {Text("Imagen de candidato")}
            )
            TextField(
                value = ic_partido,
                onValueChange = {ic_partido = it},
                label = {Text("Imagen de partido")}
            )

            Row(

                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {
                    scope.launch {
                        db.candidatoDao().insert(CandidatoEntity(nombre = nombre,
                            distrito = currentValue.value, partido = partido, dni = dni,
                            edad = edad, ic_candidato = ic_candidato, ic_partido = ic_partido))
                    }
                }) {
                    Text("Agregar")
                }
                Button(onClick = {
                    scope.launch {
                        db.candidatoDao().update(CandidatoEntity(nombre = nombre,
                            distrito = currentValue.value, partido = partido, dni = dni,
                            edad = edad, ic_candidato = ic_candidato, ic_partido = ic_partido))
                    }
                }) {
                    Text("Actualizar")
                }
                Button(onClick = {
                    scope.launch {
                        val candidato = db.candidatoDao().getByName(nombre = nombre)
                        nombre = candidato.nombre
                        partido = candidato.partido
                        dni = candidato.dni
                        edad = candidato.edad
                        ic_candidato = candidato.ic_candidato
                        ic_partido = candidato.ic_partido
                    }
                }) {
                    Text("Obtener")
                }
                Button(onClick = {
                    scope.launch {
                        db.candidatoDao().delete(
                            CandidatoEntity(nombre = nombre,
                                distrito = currentValue.value, partido = partido, dni = dni,
                                edad = edad, ic_candidato = ic_candidato, ic_partido = ic_partido)
                        )
                    }
                }) {
                    Text("Eliminar")
                }
            }

        }


    }
}