package com.minhaestante.domain.search;

import com.minhaestante.domain.model.Livro;

import java.util.ArrayList;
import java.util.Locale;

public class SearchBook {

    public void buscarBook (ArrayList<Livro> livros, String livro){
        if (livros.isEmpty()){
            System.out.println("Não a livros na sua estate!");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().toLowerCase().contains(livro.toLowerCase())){
                System.out.println("Livro encontrado: " + livros.get(i));
                encontrado = true;
            }
            if (!encontrado){
                System.out.println("Nenhum livro encontrado!" + livro);
            }
        }
    }

}
