package com.minhaestante.domain.service;

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

    public void buscarBook (String livro){
        if (livros.isEmpty()){
            System.out.println("Não a livros na sua estate!");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().toLowerCase().contains(livro.toLowerCase())) {
                System.out.println("Livro encontrado: " + livros.get(i));
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Nenhum livro encontrado!" + livro);
        }
    }
}
