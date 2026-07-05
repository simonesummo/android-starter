package it.ssummo.androidstarter.feature.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    uiState: HomeUiState
) {
    Text(uiState.message)
}