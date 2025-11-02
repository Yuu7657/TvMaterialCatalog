package com.google.tv.material.catalog.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.tv.material3.*

@Composable
fun ColorsScreen() {
    Row(
        Modifier
            .fillMaxSize()
            .padding(start = 48.dp, end = 48.dp, top = 16.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item(span = { GridItemSpan(2) }) {
                ColorBg(
                    text = "👨‍🍳 **TSU en Gastronomía**\nFormación profesional con teoría y práctica en cocina, pastelería y gestión.",
                    color = Color(0xFF5D011A) // Bordó principal
                )
            }
            item {
                ColorBg(
                    text = "📚 **Modelo educativo**\n40% teoría · 60% práctica en cocinas y laboratorios.",
                    color = Color(0xFF7A1C2E) // Bordó medio
                )
            }
            item {
                ColorBg(
                    text = "🍲 **Plan de estudios**\nBases culinarias, higiene, matemáticas, informática e inglés.",
                    color = Color(0xFFA23E55) // Bordó más claro
                )
            }
            item {
                ColorBg(
                    text = "🎓 **Licenciatura en Gastronomía**\nContinuidad al TSU con enfoque en administración y costos.",
                    color = Color(0xFF400111) // Bordó oscuro
                )
            }
            item {
                ColorBg(
                    text = "🏫 **Instalaciones**\nLaboratorio de Gastronomía con módulos y equipos especializados.",
                    color = Color(0xFF8C2742) // Bordó variante
                )
            }
            item {
                ColorBg(
                    text = "📞 **Contacto**\nUTOM, Ejido Santa Rita S/N, Maravatío, Mich.\nTel: +52 (447) 150 8913\nEmail: servicios_escolares@utom.edu.mx",
                    color = Color(0xFF5D011A) // Repite color principal
                )
            }
        }
    }
}

@Composable
private fun ColorBg(
    text: String,
    color: Color
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp), // un poco más alto para TV
        colors = SurfaceDefaults.colors(
            containerColor = color
        ),
        border = Border(
            border = BorderStroke(2.dp, Color.White) // borde claro para contraste
        )
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(14.dp),
            maxLines = 5, // evita saturar
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodyLarge.copy( // títulos más grandes
                if (color.luminance() < .25) Color.White else Color.Black
            )
        )
    }
}

