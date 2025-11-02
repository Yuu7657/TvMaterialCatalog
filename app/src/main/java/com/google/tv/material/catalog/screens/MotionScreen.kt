package com.google.tv.material.catalog.screens

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.google.tv.material.catalog.ExampleAction
import com.google.tv.material.catalog.ExamplesScreenWithDottedBackground
import kotlin.math.pow

@Composable
fun MotionScreen() {
    val actions = listOf(
        ExampleAction(
            title = "💻 Desarrollo de Software",
            content = { StandardMotion() }
        ),
        ExampleAction(
            title = "🧱 Fundamentos",
            content = { BrowseMotion() }
        ),
        ExampleAction(
            title = "🚀 Desarrollo",
            content = { EnterMotion() }
        ),
        ExampleAction(
            title = "🎯 Perfil de egreso",
            content = { ExitMotion() }
        ),
    )

    ExamplesScreenWithDottedBackground(actions)
}

// ---------- Visual solo-informativo (no cambia la animación) ----------

@Composable
private fun StandardMotion() {
    Column(verticalArrangement = Arrangement.Center) {
        val path = remember { Path() }
        val color = Color(0xFF0F6CBD) // azul UTOM-software (informativo)
        val transition by rememberInfiniteTransition(label = "").animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, delayMillis = 300, easing = CubicBezierEasing(0.2f, 0.1f, 0.0f, 1.0f)),
                repeatMode = RepeatMode.Restart
            ),
            label = "",
        )
        val circleColor = MaterialTheme.colorScheme.primary
        Canvas(modifier = Modifier.size(160.dp)) {
            val width = size.width
            val height = size.height
            val x = getOffset(transition, 0f, width * 0.2f, 0f, width)
            val y = getOffset(transition, height, width * 0.9f, 0f, 0f)
            drawRect(color = Color.White.copy(0.12f), topLeft = Offset(0f, 0f), style = Stroke(width = 1.dp.toPx()))
            path.moveTo(0f, height)
            path.cubicTo(width * 0.2f, height * 0.9f, 0f, 0f, width, 0f)
            drawPath(path = path, color = color, style = Stroke(width = 2.dp.toPx()))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(0f, height))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(width, 0f))
            drawCircle(color = circleColor, radius = 10.dp.toPx(), center = Offset(x, y))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "💻 Desarrollo de Software UTOM",
            style = MaterialTheme.typography.titleLarge,
            color = color,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "Apps multiplataforma · Bases sólidas",
            fontSize = 12.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight(500),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun BrowseMotion() {
    Column(verticalArrangement = Arrangement.Center) {
        val path = remember { Path() }
        val color = Color(0xFF00B6C2) // cian/teal para contraste tecnológico
        val transition by rememberInfiniteTransition(label = "").animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, delayMillis = 300, easing = CubicBezierEasing(0.2f, 0.1f, 0.0f, 1.0f)),
                repeatMode = RepeatMode.Restart
            ),
            label = "",
        )
        val circleColor = MaterialTheme.colorScheme.primary
        Canvas(modifier = Modifier.size(160.dp)) {
            val width = size.width
            val height = size.height
            val x = getOffset(transition, 0f, width * 0.18f, width * 0.22f, width)
            val y = getOffset(transition, height, 0f, 0f, 0f)
            drawRect(color = Color.White.copy(0.12f), topLeft = Offset(0f, 0f), style = Stroke(width = 1.dp.toPx()))
            path.moveTo(0f, height)
            path.cubicTo(width * 0.18f, 0f, width * 0.22f, 0f, width, 0f)
            drawPath(path = path, color = color, style = Stroke(width = 2.dp.toPx()))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(0f, height))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(width, 0f))
            drawCircle(color = circleColor, radius = 10.dp.toPx(), center = Offset(x, y))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "🧱 Fundamentos del stack",
            style = MaterialTheme.typography.titleLarge,
            color = color,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "POO · BD · Web · Móvil · Versionado",
            fontSize = 12.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight(500),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun EnterMotion() {
    Column(verticalArrangement = Arrangement.Center) {
        val path = remember { Path() }
        val color = Color(0xFF15A05E) // verde éxito/“deploy”
        val transition by rememberInfiniteTransition(label = "").animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, delayMillis = 300, easing = CubicBezierEasing(0.2f, 0.1f, 0.0f, 1.0f)),
                repeatMode = RepeatMode.Restart
            ),
            label = "",
        )
        val circleColor = MaterialTheme.colorScheme.primary
        Canvas(modifier = Modifier.size(160.dp)) {
            val width = size.width
            val height = size.height
            val x = getOffset(transition, 0f, width * 0.12f, width * 0.4f, width)
            val y = getOffset(transition, height, 0f, 0f, 0f)
            drawRect(color = Color.White.copy(0.12f), topLeft = Offset(0f, 0f), style = Stroke(width = 1.dp.toPx()))
            path.moveTo(0f, height)
            path.cubicTo(width * 0.12f, 0f, width * 0.4f, 0f, width, 0f)
            drawPath(path = path, color = color, style = Stroke(width = 2.dp.toPx()))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(0f, height))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(width, 0f))
            drawCircle(color = circleColor, radius = 10.dp.toPx(), center = Offset(x, y))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "🚀 Desarrollo y prácticas",
            style = MaterialTheme.typography.titleLarge,
            color = color,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "Proyectos reales · QA · Deploy",
            fontSize = 12.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight(500),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun ExitMotion() {
    Column(verticalArrangement = Arrangement.Center) {
        val path = remember { Path() }
        val color = Color(0xFFEA5A3D) // acento naranja (soft warning/salida)
        val transition by rememberInfiniteTransition(label = "").animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, delayMillis = 300, easing = CubicBezierEasing(0.2f, 0.1f, 0.0f, 1.0f)),
                repeatMode = RepeatMode.Restart
            ),
            label = "",
        )
        val circleColor = MaterialTheme.colorScheme.primary
        Canvas(modifier = Modifier.size(160.dp)) {
            val width = size.width
            val height = size.height
            val x = getOffset(transition, 0f, width * 0.4f, width * 0.12f, width)
            val y = getOffset(transition, height, 0f, 0f, 0f)
            drawRect(color = Color.White.copy(0.12f), topLeft = Offset(0f, 0f), style = Stroke(width = 1.dp.toPx()))
            path.moveTo(0f, height)
            path.cubicTo(width * 0.4f, 0f, width * 0.12f, 0f, width, 0f)
            drawPath(path = path, color = color, style = Stroke(width = 2.dp.toPx()))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(0f, height))
            drawCircle(color = color, radius = width * 0.03f, center = Offset(width, 0f))
            drawCircle(color = circleColor, radius = 10.dp.toPx(), center = Offset(x, y))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "🎯 Perfil de egreso",
            style = MaterialTheme.typography.titleLarge,
            color = color,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "Desarrollador full-stack · Ética · Innovación",
            fontSize = 12.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight(500),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

// --------- Animación intacta ---------
fun getOffset(t: Float, a1: Float, a2: Float, a3: Float, a4: Float): Float {
    return ((1 - t).pow(3).times(a1)
            + 3f.times((1 - t).pow(2)).times(t).times(a2)
            + 3f.times(1 - t).times(t.pow(2)).times(a3)
            + t.pow(3).times(a4))
}
