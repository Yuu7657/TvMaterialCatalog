package com.google.tv.material.catalog.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import coil.compose.AsyncImage
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground

@Composable
fun InteractionsScreen() {
    val actions = listOf(
        ExampleAction(
            title = "Infraestructura",
            content = {
                InfoCard(
                    // Racks / switching
                    imageUrl = "https://utom.edu.mx/wp-content/uploads/2022/09/277987761_2774282722717892_2056920227555008069_n.jpg",
                    title = "Infraestructura de Redes",
                    subtitle = "Diseño y operación de sistemas UTOM"
                )
            }

        ),
        ExampleAction(
            title = "Seguridad",
            content = {
                InfoCard(
                    // Ciberseguridad (candado)
                    imageUrl = "https://images.unsplash.com/photo-1510511459019-5dda7724fd87?auto=format&fit=crop&w=1600&q=80",
                    title = "Seguridad Digital",
                    subtitle = "Protección de datos y ciberseguridad"
                )
            }
        ),
        ExampleAction(
            title = "Conectividad",
            content = {
                InfoCard(
                    // Wi-Fi / señal
                    imageUrl = "https://images.unsplash.com/photo-1517048676732-d65bc937f952?auto=format&fit=crop&w=1600&q=80",
                    title = "Conectividad Global",
                    subtitle = "Internet, redes y telecomunicaciones"
                )
            }
        ),
        ExampleAction(
            title = "Laboratorio",
            content = {
                InfoCard(
                    // Laboratorio/placa electrónica
                    imageUrl = "https://images.unsplash.com/photo-1581091014534-8987c1d64714?auto=format&fit=crop&w=1600&q=80",
                    title = "Laboratorios UTOM",
                    subtitle = "Espacios de innovación y aprendizaje"
                )
            }
        ),
        ExampleAction(
            title = "Admisión",
            content = {
                InfoCard(
                    // Estudio/educación
                    imageUrl = "https://images.unsplash.com/photo-1523580846011-d3a5bc25702b?auto=format&fit=crop&w=1600&q=80",
                    title = "Admisión UTOM",
                    subtitle = "Únete a Redes Digitales"
                )
            }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}

@Composable
fun InfoCard(imageUrl: String, title: String, subtitle: String) {
    Surface(
        onClick = { },
        modifier = Modifier
            .width(280.dp)
            .aspectRatio(16f / 9),

    ) {
        Box(Modifier.fillMaxSize()) {
            // Imagen remota con escala correcta
            AsyncImage(
                model = imageUrl,
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Gradiente inferior para legibilidad
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .height(64.dp)
                    .background(
                        Brush.verticalGradient(
                            0f to Color.Transparent,
                            1f to Color.Black.copy(alpha = 0.55f)
                        )
                    )
            )

            // Textos
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White.copy(alpha = 0.9f),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
