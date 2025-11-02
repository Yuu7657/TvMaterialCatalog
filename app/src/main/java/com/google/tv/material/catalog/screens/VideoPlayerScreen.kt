package com.google.tv.material.catalog.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.AudioAttributes
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.datasource.RawResourceDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.google.tv.material.catalog.R

@Composable
fun VideoHeroCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val context = LocalContext.current

    val exo = remember {
        ExoPlayer.Builder(context).build().apply {
            val audioAttrs = AudioAttributes.Builder()
                .setUsage(C.USAGE_MEDIA)
                .setContentType(C.AUDIO_CONTENT_TYPE_MOVIE)
                .build()
            setAudioAttributes(audioAttrs, true)
            volume = 0f
            repeatMode = Player.REPEAT_MODE_ALL

            val raw = RawResourceDataSource.buildRawResourceUri(R.raw.modelo_educativo)
            setMediaItem(MediaItem.fromUri(raw))
            prepare()
            playWhenReady = true
        }
    }

    val keyHandler = Modifier.onPreviewKeyEvent { e ->
        val nk = e.nativeKeyEvent
        if (nk.action == android.view.KeyEvent.ACTION_DOWN &&
            (nk.keyCode == android.view.KeyEvent.KEYCODE_DPAD_CENTER ||
                    nk.keyCode == android.view.KeyEvent.KEYCODE_ENTER ||
                    nk.keyCode == android.view.KeyEvent.KEYCODE_NUMPAD_ENTER ||
                    nk.keyCode == android.view.KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE)
        ) { onClick(); true } else false
    }


    Box(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(16f / 9f)    // Hero 16:9
            .focusable()
            .clickable { onClick() }
            .then(keyHandler)
    ) {
        AndroidView(factory = { ctx ->
            PlayerView(ctx).apply {
                player = exo
                useController = false   // sin controles en portada
                setShowBuffering(PlayerView.SHOW_BUFFERING_WHEN_PLAYING)
                isFocusable = false     // no roba el foco del grid
            }
        })
    }

    DisposableEffect(Unit) { onDispose { exo.release() } }
}