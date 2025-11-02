package com.google.tv.material.catalog.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.tv.material3.AssistChip
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.FilterChip
import androidx.tv.material3.Icon
import androidx.tv.material3.InputChip
import androidx.tv.material3.SuggestionChip
import androidx.tv.material3.Text
import coil.compose.AsyncImage
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun ChipsScreen() {
    val actions = listOf(
        // 1) Assist Chip — Competencias UTOM
        ExampleAction(
            title = "Competencias clave",
            content = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    AssistChip(onClick = { }) {
                        Text(text = "Competencias UTOM")
                    }

                    AssistChip(
                        onClick = { },
                        leadingIcon = {
                            // Icono desde internet (skills/competence)
                            AsyncImage(
                                model = "https://source.unsplash.com/48x48/?skills,competence,learning",
                                contentDescription = "Competencias",
                                modifier = Modifier.size(24.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                    ) {
                        Text(text = "Aprendizaje por competencias")
                    }
                }
            }
        ),

        // 2) Filter Chip — Evidencias y evaluación
        ExampleAction(
            title = "Evidencias y evaluación",
            content = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    var isSelected1 by remember { mutableStateOf(false) }
                    FilterChip(
                        selected = isSelected1,
                        onClick = { isSelected1 = !isSelected1 }
                    ) {
                        Text(text = "Portafolio")
                    }

                    var isSelected2 by remember { mutableStateOf(false) }
                    FilterChip(
                        selected = isSelected2,
                        onClick = { isSelected2 = !isSelected2 },
                        leadingIcon = {
                            // Icono desde internet (rúbricas/checklist)
                            AsyncImage(
                                model = "https://source.unsplash.com/48x48/?checklist,assessment",
                                contentDescription = "Rúbricas",
                                modifier = Modifier.size(24.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                    ) {
                        Text(text = "Rúbricas")
                    }
                }
            }
        ),

        // 3) Input Chip — Rutas de aprendizaje
        ExampleAction(
            title = "Rutas de aprendizaje",
            content = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    var isSelected1 by remember { mutableStateOf(false) }
                    InputChip(
                        selected = isSelected1,
                        onClick = { isSelected1 = !isSelected1 },
                        leadingIcon = {
                            // Icono desde internet (roadmap/back-end)
                            AsyncImage(
                                model = "https://utom.edu.mx/wp-content/uploads/2024/02/IMG_2675-scaled.jpg",
                                contentDescription = "Ruta Backend",
                                modifier = Modifier.size(24.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                    ) {
                        Text(text = "Ruta Backend")
                    }

                    var isSelected2 by remember { mutableStateOf(false) }
                    InputChip(
                        selected = isSelected2,
                        onClick = { isSelected2 = !isSelected2 },
                        leadingIcon = {
                            // Icono desde internet (frontend/ui)
                            AsyncImage(
                                model = "https://source.unsplash.com/48x48/?frontend,ui,design",
                                contentDescription = "Ruta Frontend",
                                modifier = Modifier.size(24.dp),
                                contentScale = ContentScale.Crop
                            )
                        },
                        trailingIcon = clearIcon // conservamos acción visual de limpiar
                    ) {
                        Text(text = "Ruta Frontend")
                    }
                }
            }
        ),

        // 4) Suggestion Chip — Sugerencias de práctica
        ExampleAction(
            title = "Sugerencias de práctica",
            content = {
                SuggestionChip(onClick = { }) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Icono desde internet (proyecto/práctica)
                        AsyncImage(
                            model = "https://source.unsplash.com/48x48/?project,team,practice",
                            contentDescription = "Proyecto integrador",
                            modifier = Modifier.size(22.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Proyecto integrador")
                    }
                }
            }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}

// (Dejamos estos íconos por si quieres revertir a materiales en algún momento)
private val editIcon = @Composable {
    Icon(
        imageVector = Icons.Default.Edit,
        contentDescription = "Edit icon",
    )
}

private val checkIcon = @Composable {
    Icon(
        imageVector = Icons.Default.Check,
        contentDescription = "Check icon",
    )
}

private val clearIcon = @Composable {
    Icon(
        imageVector = Icons.Default.Clear,
        contentDescription = "Clear icon",
    )
}
