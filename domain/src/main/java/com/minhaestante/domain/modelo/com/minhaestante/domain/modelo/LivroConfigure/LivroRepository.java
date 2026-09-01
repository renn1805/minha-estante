package com.minhaestante.domain.modelo.LivroConfigure;
import com.minhaestante.domain.modelo.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List <Livro> livros = new ArrayList<>();

        public void cadastrasLivro(Livro livro) {
            this.livros.add(livro);
        }
}
