package com.minhaestante.domain.modelo;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class LivroRepository {
    List <Livro> livros = new ArrayList<>();

        public void cadastrasLivro(Livro livro) {
            this.livros.add(livro);
        }
}
