package org.iamelattar.petshelter

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.iamelattar.petshelter.navigation.NavGraph
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavGraph()
    }
}