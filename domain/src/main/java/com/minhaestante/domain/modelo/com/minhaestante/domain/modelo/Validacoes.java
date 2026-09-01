package com.minhaestante.domain.modelo;

public class Validacoes {
    private String  validarETratarTexto(String texto, String nomeDoCampo){
        if (texto == null || texto.trim().isEmpty()){
            throw new IllegalArgumentException("O campo " + nomeDoCampo + " não pode ser vazio!");
        }
        return texto.trim();
    }
}
