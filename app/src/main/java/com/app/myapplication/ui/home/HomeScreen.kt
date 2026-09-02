package com.app.myapplication.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.myapplication.ui.theme.Typography
import com.minhaestante.domain.config.LivroRepository

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column (
        modifier = Modifier.fillMaxSize().padding(20.dp, 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Meus Livros",
            style = Typography.titleLarge
        )

        Spacer(Modifier.height(20.dp))
        val repository = LivroRepository()

        Feed(
            livros = repository.livros
        )

    }
}