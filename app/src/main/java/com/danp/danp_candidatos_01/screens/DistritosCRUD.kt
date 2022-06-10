package com.danp.danp_candidatos_01.screens


import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.navigation.NavController
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.room.Room
import coil.compose.rememberImagePainter
import com.danp.danp_candidatos_01.data.DistritoEntity
import com.danp.danp_candidatos_01.data.EleccionesDataBase
import kotlinx.coroutines.launch


@Composable
fun DistritosCRUD(navController: NavController){

    /*var selectedImage by remember { mutableStateOf<Uri?>(null) }
    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { uri ->
        selectedImage = uri
    }*/

    var nombre by remember {mutableStateOf("")}
    var altura by remember {mutableStateOf("")}
    var poblacion by remember {mutableStateOf("")}
    var superficie by remember {mutableStateOf("")}
    var descripcion by remember {mutableStateOf("")}
    var candidatos by remember {mutableStateOf("")}
    var ic_imagen by remember {mutableStateOf("")}

    val db = Room.databaseBuilder(
        LocalContext.current,
        EleccionesDataBase::class.java, "elecciones"
    ).build()

    val scope = rememberCoroutineScope()

    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Distritos CRUD")
        }
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = nombre,
                onValueChange = {nombre = it},
                label = {Text("Nombre")}
            )
            TextField(
                value = altura,
                onValueChange = {altura = it},
                label = {Text("Altura")}
            )
            TextField(
                value = poblacion,
                onValueChange = {poblacion = it},
                label = {Text("Problación")}
            )
            TextField(
                value = superficie,
                onValueChange = {superficie = it},
                label = {Text("Superficie")}
            )
            TextField(
                value = descripcion,
                onValueChange = {descripcion = it},
                label = {Text("Descripción")}
            )
            TextField(
                value = candidatos,
                onValueChange = {candidatos = it},
                label = {Text("Cantidad de Candidatos")}
            )
            TextField(
                value = ic_imagen,
                onValueChange = {ic_imagen = it},
                label = {Text("Imagen")}
            )

            /*MainContent(selectedImage) {
                launcher.launch("image/jpeg")
            }*/

            Row(

                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {
                    scope.launch {
                        db.distritoDao().insert(DistritoEntity(nombre = nombre, altura = altura,
                        poblacion = poblacion, superficie = superficie, descripcion = descripcion,
                        candidatos = candidatos, ic_imagen = ic_imagen))
                    }
                }) {
                    Text("Agregar")
                }
                Button(onClick = {
                    scope.launch {
                        db.distritoDao().update(DistritoEntity(nombre = nombre, altura = altura,
                                poblacion = poblacion, superficie = superficie, descripcion = descripcion,
                                candidatos = candidatos, ic_imagen = ic_imagen))
                    }
                }) {
                    Text("Actualizar")
                }
                Button(onClick = {
                    scope.launch {
                        val distrito = db.distritoDao().getByName(nombre = nombre)
                        nombre = distrito.nombre
                        altura = distrito.altura
                        poblacion = distrito.poblacion
                        superficie = distrito.superficie
                        descripcion = distrito.descripcion
                        candidatos = distrito.candidatos
                        ic_imagen = distrito.ic_imagen
                    }
                }) {
                    Text("Obtener")
                }
                Button(onClick = {
                    scope.launch {
                        db.distritoDao().delete(
                            DistritoEntity(nombre = nombre, altura = altura,
                                poblacion = poblacion, superficie = superficie, descripcion = descripcion,
                                candidatos = candidatos, ic_imagen = ic_imagen)
                        )
                    }
                }) {
                    Text("Eliminar")
                }
            }
        }
    }
}

/*@Composable
private fun MainContent(
    selectedImage: Uri? = null,
    onImageClick: () -> Unit
) {
    Scaffold() {
        Column(
            Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (selectedImage != null)
                Image(
                    painter = rememberImagePainter(selectedImage),
                    contentDescription = "Selected image",
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            onImageClick()
                        })
            else
                OutlinedButton(onClick = onImageClick) {
                    Text(text = "Choose Image")
                }
        }
    }
}*/
