package com.google.tv.material.catalog.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.tv.material3.DenseListItem
import androidx.tv.material3.ListItem
import androidx.tv.material3.ListItemDefaults
import androidx.tv.material3.Text
import coil.compose.AsyncImage
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground

@Composable
fun ListsScreen() {
    val actions = listOf(
        // Lista estándar: Vinculación y Estadías (información principal)
        ExampleAction(
            title = "Vinculación y estadías",
            content = {
                Column(
                    Modifier.width(300.dp),
                    verticalArrangement = Arrangement.spacedBy(30.dp)
                ) {
                    var selected1 by remember { mutableStateOf(false) }
                    ListItem(
                        selected = selected1,
                        onClick = { selected1 = !selected1 },
                        headlineContent = { Text("Vinculación empresarial") },
                        supportingContent = {
                            Text(
                                text = "Alianzas con el sector productivo",
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        },
                        leadingContent = {
                            // Imagen: alianzas/handshake
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?handshake,partnership,business",
                                contentDescription = "Vinculación empresarial",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.size(ListItemDefaults.IconSize)
                            )
                        },
                    )

                    var selected2 by remember { mutableStateOf(false) }
                    ListItem(
                        selected = selected2,
                        onClick = { selected2 = !selected2 },
                        headlineContent = { Text("Estadías profesionales") },
                        supportingContent = {
                            Text(
                                text = "Prácticas en empresas y organizaciones",
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        },
                        leadingContent = {
                            // Imagen: internship/oficina
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?internship,office,team",
                                contentDescription = "Estadías profesionales",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.size(ListItemDefaults.IconSize)
                            )
                        },
                    )
                }
            }
        ),

        // Lista compacta: opciones complementarias
        ExampleAction(
            title = "Opciones complementarias",
            content = {
                Column(
                    Modifier.width(300.dp),
                    verticalArrangement = Arrangement.spacedBy(30.dp)
                ) {
                    var selected1 by remember { mutableStateOf(false) }
                    DenseListItem(
                        selected = selected1,
                        onClick = { selected1 = !selected1 },
                        headlineContent = { Text("Bolsa de trabajo") },
                        supportingContent = {
                            Text(
                                text = "Empleabilidad y seguimiento de egresados",
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        },
                        leadingContent = {
                            // Imagen: empleo/carrera
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?career,job,opportunity",
                                contentDescription = "Bolsa de trabajo",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.size(ListItemDefaults.IconSizeDense)
                            )
                        },
                    )

                    var selected2 by remember { mutableStateOf(false) }
                    DenseListItem(
                        selected = selected2,
                        onClick = { selected2 = !selected2 },
                        headlineContent = { Text("Servicio social") },
                        supportingContent = {
                            Text(
                                text = "Proyectos de impacto comunitario",
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        },
                        leadingContent = {
                            // Imagen: voluntariado/comunidad
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?volunteer,community,students",
                                contentDescription = "Servicio social",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.size(ListItemDefaults.IconSizeDense)
                            )
                        },
                    )
                }
            }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}
