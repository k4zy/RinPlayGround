package com.k4zy.rin.playground

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "RInPlayGround",
    ) {
        App()
    }
}