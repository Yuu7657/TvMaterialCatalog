package com.google.tv.material.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Card
import androidx.tv.material3.CardDefaults
import androidx.tv.material3.StandardCardContainer
import androidx.tv.material3.Text
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ComponentsGridCard(
    component: Component,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val isUrl = remember(component.imageArg) {
        component.imageArg.startsWith("http", ignoreCase = true)
    }

    // Si sigues usando drawables por nombre, conservamos tu helper:
    val localResId = if (!isUrl) getHomeGridCardImage(imageArg = component.imageArg) else 0

    StandardCardContainer(
        modifier = modifier,
        imageCard = {
            Card(
                onClick = { onClick() },
                interactionSource = it,
                colors = CardDefaults.colors(containerColor = Color.Transparent)
            ) {
                if (isUrl) {
                    val ctx = LocalContext.current
                    AsyncImage(
                        model = ImageRequest.Builder(ctx)
                            .data(component.imageArg)
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9f),
                        contentScale = ContentScale.Crop
                    )
                } else if (localResId != 0) {
                    Image(
                        painter = painterResource(id = localResId),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9f),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    // Fallback por si el nombre no existe como recurso (intenta cargarlo como URL)
                    val ctx = LocalContext.current
                    AsyncImage(
                        model = ImageRequest.Builder(ctx)
                            .data(component.imageArg)
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9f),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        },
        title = {
            Text(
                text = component.title,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    )
}
