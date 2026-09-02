package com.minhaestante.domain.config;
import com.minhaestante.domain.model.Livro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LivroRepository {
    private List <Livro> livros = new ArrayList<>(
             List.of(new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", "9788575225639", null)));

        public void cadastrasLivro(Livro livro) {
            this.livros.add(livro);
        }

        public List<Livro> getLivros() {
            return this.livros;
        }

}
