package com.google.tv.material.catalog.screens

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

private fun guessMimeType(url: String): String = when {
    url.endsWith(".m3u8", ignoreCase = true) -> "application/x-mpegURL" // HLS
    url.endsWith(".mpd",  ignoreCase = true) -> "application/dash+xml"  // DASH
    else -> "video/*" // MP4 u otros
}

/** Abre un reproductor externo (sistema/terceros) para la URL dada. */
fun openExternalPlayer(context: Context, url: String) {
    val uri = Uri.parse(url)
    val mime = guessMimeType(url)
    val intent = Intent(Intent.ACTION_VIEW).apply {
        setDataAndType(uri, mime)
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    }
    try {
        context.startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(context, "No hay app para reproducir este video", Toast.LENGTH_LONG).show()
    }



}

