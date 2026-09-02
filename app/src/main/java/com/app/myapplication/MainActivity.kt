package com.app.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.app.myapplication.ui.home.HomeScreen
import com.app.myapplication.ui.theme.MyApplicationTheme
import com.app.myapplication.ui.theme.*
import com.app.myapplication.ui.theme.myNavigationSuiteItemColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MyApplicationApp()
            }
        }
    }
}


@PreviewScreenSizes
@Composable
fun MyApplicationApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    val navigationColors = myNavigationSuiteColors()
    val navigationItemColors = myNavigationSuiteItemColors()

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            it.icon,
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it },
                    colors = navigationItemColors
                )
            }
        },
        navigationSuiteColors = navigationColors
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            when (currentDestination) {
                AppDestinations.HOME -> {
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
                AppDestinations.PESQUISA -> {}
                AppDestinations.ADICIONAR -> {}
            }
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector
) {
    HOME("Home", Icons.Default.Home),
    PESQUISA("Pesquisa", Icons.Default.Search),
    ADICIONAR("Adicionar", Icons.Default.Add),
}