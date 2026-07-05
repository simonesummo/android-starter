package it.ssummo.androidstarter.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import it.ssummo.androidstarter.feature.home.HomeDestination
import it.ssummo.androidstarter.feature.home.HomeRoute

fun NavGraphBuilder.homeScreen() {
    composable<HomeDestination> {
        HomeRoute()
    }
}