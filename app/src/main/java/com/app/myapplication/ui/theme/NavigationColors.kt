package com.app.myapplication.ui.theme

import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteColors
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItemColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun myNavigationSuiteColors(): NavigationSuiteColors {
    return NavigationSuiteDefaults.colors(
        navigationBarContainerColor = Color(0xFFF1F3F5),
        navigationBarContentColor = Color(0xFF546E7A),

        navigationRailContainerColor = Color(0xFFF8F9FA),
        navigationRailContentColor = Color(0xFF546E7A),

        navigationDrawerContainerColor = Color(0xFFF8F9FA),
        navigationDrawerContentColor = Color(0xFF546E7A)
    )
}

@Composable
fun myNavigationSuiteItemColors(): NavigationSuiteItemColors {
    return NavigationSuiteDefaults.itemColors(
        navigationBarItemColors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color(0xFF263238),
            selectedTextColor = Color(0xFF263238),
            indicatorColor = Color(0xFFDCE8EE),

            unselectedIconColor = Color(0xFF607D8B),
            unselectedTextColor = Color(0xFF607D8B),

            disabledIconColor = Color(0xFFB0BEC5),
            disabledTextColor = Color(0xFFB0BEC5)
        ),

        navigationRailItemColors = NavigationRailItemDefaults.colors(
            selectedIconColor = Color(0xFF263238),
            selectedTextColor = Color(0xFF263238),
            indicatorColor = Color(0xFFDCE8EE),

            unselectedIconColor = Color(0xFF607D8B),
            unselectedTextColor = Color(0xFF607D8B),

            disabledIconColor = Color(0xFFB0BEC5),
            disabledTextColor = Color(0xFFB0BEC5)
        ),

        navigationDrawerItemColors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Color(0xFFDCE8EE),
            unselectedContainerColor = Color.Transparent,

            selectedIconColor = Color(0xFF263238),
            unselectedIconColor = Color(0xFF607D8B),

            selectedTextColor = Color(0xFF263238),
            unselectedTextColor = Color(0xFF607D8B)
        )
    )
}