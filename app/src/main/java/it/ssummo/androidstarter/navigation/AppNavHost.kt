package it.ssummo.androidstarter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import it.ssummo.androidstarter.feature.home.HomeDestination

@Composable
fun AppNavHost(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = HomeDestination
    ) {
        homeScreen()
    }
}