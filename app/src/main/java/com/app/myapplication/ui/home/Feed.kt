package com.app.myapplication.ui.home

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import com.app.myapplication.ui.theme.Typography
import com.minhaestante.domain.model.Livro

@Composable
fun Feed(
    modifier: Modifier = Modifier,
    livros: List<Livro>
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(livros) { livro ->

            Column(
                Modifier.fillMaxWidth()
            ) {

                val bitmap = BitmapFactory.decodeByteArray(
                    livro.capa,
                    0,
                    livro.capa.size
                )

                if (bitmap != null) {
                    Image(
                        bitmap = bitmap.asImageBitmap(),
                        contentDescription = livro.titulo,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Color.Gray,
                                RoundedCornerShape(10.dp)
                            ),
                        alignment = Alignment.Center
                    )
                } else {
                    Text(
                        text = "Imagem inválida",
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Spacer(Modifier.height(8.dp))

                Text(
                    text = livro.titulo,
                    style = Typography.titleLarge
                )

                Spacer(Modifier.height(14.dp))

                Text(
                    text = livro.sinopse,
                    style = Typography.bodyLarge
                )

                Spacer(Modifier.height(8.dp))

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Autor:",
                        style = Typography.titleMedium
                    )

                    Text(
                        text = livro.autor,
                        style = Typography.titleSmall
                    )
                }
            }
        }
    }
}