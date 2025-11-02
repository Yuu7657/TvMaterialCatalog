package com.google.tv.material.catalog.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Button
import androidx.tv.material3.ButtonDefaults
import androidx.tv.material3.IconButton
import androidx.tv.material3.IconButtonDefaults
import androidx.tv.material3.OutlinedButton
import androidx.tv.material3.OutlinedButtonDefaults
import androidx.tv.material3.OutlinedIconButton
import androidx.tv.material3.OutlinedIconButtonDefaults
import androidx.tv.material3.Text
import androidx.tv.material3.WideButton
import coil.compose.AsyncImage
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground

@Composable
fun ButtonsScreen() {
    val actions = listOf(
        // Sección 1: Modelo 60% práctica
        ExampleAction(
            title = "Modelo 60% práctica",
            content = {
                Row {
                    Button(onClick = { }) {
                        Text(text = "60% Práctica")
                    }

                    Spacer(Modifier.size(20.dp))

                    Button(
                        onClick = { },
                        contentPadding = ButtonDefaults.ButtonWithIconContentPadding
                    ) {
                        // Icono con imagen (prácticas/taller)
                        AsyncImage(
                            model = "https://source.unsplash.com/64x64/?workshop,practice,tools",
                            contentDescription = "Práctica en taller",
                            modifier = Modifier.size(ButtonDefaults.IconSize),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        Text(text = "Aula–Taller")
                    }
                }
            }
        ),

        // Sección 2: Aula–Taller y Laboratorios
        ExampleAction(
            title = "Aula–Taller y Laboratorios",
            content = {
                Row {
                    OutlinedButton(onClick = { }) {
                        Text(text = "Aula–Taller")
                    }

                    Spacer(Modifier.size(20.dp))

                    OutlinedButton(
                        onClick = { },
                        contentPadding = OutlinedButtonDefaults.ButtonWithIconContentPadding
                    ) {
                        // Icono con imagen (laboratorio)
                        AsyncImage(
                            model = "https://source.unsplash.com/64x64/?laboratory,experiment,lab",
                            contentDescription = "Laboratorios",
                            modifier = Modifier.size(OutlinedButtonDefaults.IconSize),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(Modifier.size(OutlinedButtonDefaults.IconSpacing))
                        Text(text = "Laboratorios")
                    }
                }
            }
        ),

        // Sección 3: Competencias y Evaluación (icon buttons)
        ExampleAction(
            title = "Competencias y evaluación",
            content = {
                Column(
                    verticalArrangement = Arrangement.spacedBy(30.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        IconButton(
                            onClick = { },
                            modifier = Modifier.size(IconButtonDefaults.SmallButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/96x96/?skills,checklist",
                                contentDescription = "Competencias",
                                modifier = Modifier.size(IconButtonDefaults.SmallIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }

                        IconButton(
                            onClick = { },
                            modifier = Modifier.size(IconButtonDefaults.MediumButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/128x128/?learning,practice",
                                contentDescription = "Aprendizaje práctico",
                                modifier = Modifier.size(IconButtonDefaults.MediumIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }

                        IconButton(
                            onClick = { },
                            modifier = Modifier.size(IconButtonDefaults.LargeButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?assessment,exam",
                                contentDescription = "Evaluación",
                                modifier = Modifier.size(IconButtonDefaults.LargeIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        OutlinedIconButton(
                            onClick = { },
                            modifier = Modifier.size(OutlinedIconButtonDefaults.SmallButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/96x96/?mentor,teacher",
                                contentDescription = "Mentoría",
                                modifier = Modifier.size(OutlinedIconButtonDefaults.SmallIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }

                        OutlinedIconButton(
                            onClick = { },
                            modifier = Modifier.size(OutlinedIconButtonDefaults.MediumButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/128x128/?team,project",
                                contentDescription = "Proyecto en equipo",
                                modifier = Modifier.size(OutlinedIconButtonDefaults.MediumIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }

                        OutlinedIconButton(
                            onClick = { },
                            modifier = Modifier.size(OutlinedIconButtonDefaults.LargeButtonSize)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/160x160/?portfolio,code",
                                contentDescription = "Evidencias/portafolio",
                                modifier = Modifier.size(OutlinedIconButtonDefaults.LargeIconSize),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
            }
        ),

        // Sección 4: Vinculación y Estadías (wide buttons)
        ExampleAction(
            title = "Vinculación y estadías",
            content = {
                Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                    WideButton(
                        onClick = { },
                        title = { Text("Vinculación") },
                        icon = {
                            // Imagen de alianza/empresa
                            AsyncImage(
                                model = "https://source.unsplash.com/80x80/?handshake,partnership",
                                contentDescription = "Vinculación UTOM",
                                contentScale = ContentScale.Crop
                            )
                        }
                    )

                    WideButton(
                        onClick = { },
                        title = { Text("Estadías Profesionales") },
                        icon = {
                            // Imagen de práctica profesional
                            AsyncImage(
                                model = "https://source.unsplash.com/80x80/?internship,office",
                                contentDescription = "Estadías UTOM",
                                contentScale = ContentScale.Crop
                            )
                        },
                        subtitle = { Text(text = "Práctica en el sector productivo") },
                    )
                }
            }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}
