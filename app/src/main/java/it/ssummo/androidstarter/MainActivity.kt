package it.ssummo.androidstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import it.ssummo.androidstarter.ui.theme.AndroidStarterTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidStarterTheme {
                AndroidStarterApp()
            }
        }
    }
}