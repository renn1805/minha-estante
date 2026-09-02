package com.minhaestante.domain.config;
import com.minhaestante.domain.model.Livro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class LivroRepository {

    private List<Livro> livros;

    public LivroRepository() {

        String imagemBase64 =
                "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNk+M/wHwAF/gL+JQ8VAAAAAElFTkSuQmCC";

        byte[] dadosEmBytes = Base64.getDecoder().decode(imagemBase64);

        this.livros =  new ArrayList<>(List.of(
                new Livro(
                        "Entendendo Algoritmos",
                        "Um guia ilustrado para programadores",
                        "Aditya Y. Bhargava",
                        dadosEmBytes
                )
        ));
    }

    public void cadastrasLivro(Livro livro) {
           this.livros.add(livro);
    }

    public List<Livro> getLivros() {
            return this.livros;
        }

}
