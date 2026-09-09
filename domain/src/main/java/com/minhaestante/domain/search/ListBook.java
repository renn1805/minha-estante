package com.minhaestante.domain.search;

import com.minhaestante.domain.model.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListBook {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void addBook(Livro livro){
        livros.add(livro);
        Collections.sort(livros, Comparator.comparing(Livro :: getTitulo));
    }

    public void shoewBook (){
        if (livros.isEmpty()){
            System.out.println("Não a livros na sua estante!");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
