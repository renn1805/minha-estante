package main.java.com.minhaestante.domain.config;
import main.java.com.minhaestante.domain.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List <Livro> livros = new ArrayList<>();

        public void cadastrasLivro(Livro livro) {
            this.livros.add(livro);
        }

        public List<Livro> getLivros() {
            return this.livros;
        }
}
