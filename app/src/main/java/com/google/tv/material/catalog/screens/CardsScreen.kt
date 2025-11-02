package com.google.tv.material.catalog.screens

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Card
import androidx.tv.material3.CardDefaults
import androidx.tv.material3.ClassicCard
import androidx.tv.material3.CompactCard
import androidx.tv.material3.StandardCardContainer
import androidx.tv.material3.Text
import androidx.tv.material3.WideCardContainer
import androidx.tv.material3.WideClassicCard
import coil.compose.AsyncImage
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground

@Composable
fun CardsScreen() {
    val actions = listOf(
        // Aula–Taller (modelo 60% práctica)
        ExampleAction(
            title = "Aula–Taller",
            content = {
                StandardCardContainer(
                    modifier = Modifier.width(180.dp),
                    imageCard = {
                        Card(
                            onClick = { },
                            interactionSource = it,
                            colors = CardDefaults.colors(containerColor = Color.Transparent)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/800x450/?workshop,classroom,tools",
                                contentDescription = "Aula–Taller UTOM",
                                contentScale = ContentScale.Crop,
                                placeholder = ColorPainter(Color(0xFF2B2B2B)),
                                error = ColorPainter(Color(0xFF444444)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .aspectRatio(CardDefaults.HorizontalImageAspectRatio)
                            )
                        }
                    },
                    title = {
                        Text(
                            text = "Aula–Taller UTOM",
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    },
                    subtitle = {
                        Text(text = "Práctica guiada en entorno real")
                    },
                )
            }
        ),

        // Laboratorio de Redes
        ExampleAction(
            title = "Laboratorio de Redes",
            content = {
                ClassicCard(
                    onClick = { },
                    modifier = Modifier.width(180.dp),
                    image = {
                        AsyncImage(
                            model = "https://source.unsplash.com/800x450/?networking,switch,rack,cabling",
                            contentDescription = "Laboratorio de Redes",
                            contentScale = ContentScale.Crop,
                            placeholder = ColorPainter(Color(0xFF2B2B2B)),
                            error = ColorPainter(Color(0xFF444444)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(CardDefaults.HorizontalImageAspectRatio)
                        )
                    },
                    title = {
                        Text(
                            text = "Laboratorio de Redes",
                            modifier = Modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp)
                        )
                    },
                    subtitle = {
                        Text(
                            text = "Switching • Cableado • VLAN",
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 8.dp
                            )
                        )
                    },
                )
            }
        ),

        // Laboratorio de Biotecnología
        ExampleAction(
            title = "Laboratorio de Biotecnología",
            content = {
                CompactCard(
                    onClick = { },
                    modifier = Modifier.width(180.dp),
                    image = {
                        AsyncImage(
                            model = "https://source.unsplash.com/800x450/?biotechnology,lab,microscope",
                            contentDescription = "Laboratorio de Biotecnología",
                            contentScale = ContentScale.Crop,
                            placeholder = ColorPainter(Color(0xFF2B2B2B)),
                            error = ColorPainter(Color(0xFF444444)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(CardDefaults.HorizontalImageAspectRatio)
                        )
                    },
                    title = {
                        Text(
                            text = "Laboratorio de Biotecnología",
                            modifier = Modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp)
                        )
                    },
                    subtitle = {
                        Text(
                            text = "Microbiología • Bioprocesos",
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 8.dp
                            )
                        )
                    },
                )
            }
        ),

        // Wide: Laboratorio de Gastronomía
        ExampleAction(
            title = "Laboratorio de Gastronomía",
            content = {
                WideCardContainer(
                    modifier = Modifier,
                    imageCard = {
                        Card(
                            onClick = { },
                            interactionSource = it,
                            colors = CardDefaults.colors(containerColor = Color.Transparent)
                        ) {
                            AsyncImage(
                                model = "https://source.unsplash.com/800x450/?culinary,kitchen,chef",
                                contentDescription = "Laboratorio de Gastronomía",
                                contentScale = ContentScale.Crop,
                                placeholder = ColorPainter(Color(0xFF2B2B2B)),
                                error = ColorPainter(Color(0xFF444444)),
                                modifier = Modifier
                                    .width(180.dp)
                                    .aspectRatio(CardDefaults.HorizontalImageAspectRatio)
                            )
                        }
                    },
                    title = {
                        Text(
                            text = "Laboratorio de Gastronomía",
                            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                        )
                    },
                    subtitle = {
                        Text(
                            text = "Cocina • Higiene • Mise en place",
                            modifier = Modifier.padding(start = 16.dp, top = 4.dp)
                        )
                    },
                )
            }
        ),

        // Wide classic: Laboratorios TIC
        ExampleAction(
            title = "Laboratorios TIC",
            content = {
                WideClassicCard(
                    onClick = { },
                    modifier = Modifier,
                    image = {
                        AsyncImage(
                            model = "https://source.unsplash.com/800x450/?programming,code,computer,lab",
                            contentDescription = "Laboratorios TIC",
                            contentScale = ContentScale.Crop,
                            placeholder = ColorPainter(Color(0xFF2B2B2B)),
                            error = ColorPainter(Color(0xFF444444)),
                            modifier = Modifier
                                .width(180.dp)
                                .aspectRatio(CardDefaults.HorizontalImageAspectRatio)
                        )
                    },
                    title = {
                        Text(
                            text = "Laboratorios TIC",
                            modifier = Modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp)
                        )
                    },
                    subtitle = {
                        Text(
                            text = "Desarrollo • QA • Cloud",
                            modifier = Modifier.padding(
                                top = 4.dp,
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 8.dp
                            )
                        )
                    },
                    description = {
                        Text(
                            text = "Prácticas con herramientas actuales: IDEs, control de versiones y despliegue.",
                            modifier = Modifier
                                .width(200.dp)
                                .padding(
                                    top = 4.dp,
                                    start = 8.dp,
                                    end = 8.dp,
                                    bottom = 8.dp
                                )
                        )
                    }
                )
            }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}
