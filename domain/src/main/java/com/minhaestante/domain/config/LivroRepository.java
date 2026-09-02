package com.minhaestante.domain.config;
import com.minhaestante.domain.model.Livro;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LivroRepository {

    private byte[] carregarCapaDoDisco(String caminhoDaImagem) {
        try {
            File arquivoImagem = new File(caminhoDaImagem);
            return Files.readAllBytes(arquivoImagem.toPath());
        } catch (IOException e) {System.err.println("Erro ao carregar a imagem da capa: " + e.getMessage());
            return null;
        }
    }
    private List<Livro> livros = new ArrayList<>(List.of(
            new Livro(
                    "Entendendo Algoritmos",
                    "Um guia ilustrado para programadores",
                    "Aditya Y. Bhargava",
                    carregarCapaDoDisco("D:\\RenanGabriel\\domain\\src\\main\\java\\com\\minhaestante\\domain\\img\\imgteste.jpg")
            )
    ));

    //private List <Livro> livros = new ArrayList<>(
     //        List.of(new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", "9788575225639", null)));

       public void cadastrasLivro(Livro livro) {
           this.livros.add(livro);
        }

        public List<Livro> getLivros() {
            return this.livros;
        }

}
