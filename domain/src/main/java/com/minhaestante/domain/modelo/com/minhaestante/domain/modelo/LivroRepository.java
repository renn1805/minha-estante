package com.minhaestante.domain.modelo;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List <Livro> livros = new ArrayList<>();

        public void cadastrasLivro(Livro livro) {
            this.livros.add(livro);
        }
}
