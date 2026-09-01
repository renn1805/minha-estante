package com.app.myapplication.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.app.myapplication.ui.theme.Typography

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxSize().padding(20.dp, 30.dp)
    ){
        Text(
            text = "Meus Livros",
            style = Typography.titleLarge,
            modifier = Modifier.align(Alignment.TopCenter)
        )
    }
}