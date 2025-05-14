package org.iamelattar.petshelter.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.viewModelFactory

@Composable
fun HomeScreen(
    viewModel: HomeViewModel ,

){
    val state by viewModel.state.collectAsStateWithLifecycle()

    Box(Modifier.fillMaxSize()){
        Text(state.data.toString() , modifier = Modifier.align(Alignment.Center))
    }
}