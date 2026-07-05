package it.ssummo.androidstarter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import it.ssummo.androidstarter.di.appModule
import it.ssummo.androidstarter.navigation.AppNavHost
import org.koin.compose.KoinApplication
import org.koin.dsl.koinConfiguration

@Composable
fun AndroidStarterApp() {
    KoinApplication(configuration = koinConfiguration {
        modules(appModule)
    }) {
        Scaffold { padding ->
            AppNavHost(Modifier.padding(padding))
        }
    }
}