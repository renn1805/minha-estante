package com.minhaestante.domain.modelo.LivroConfigure;

import com.minhaestante.domain.modelo.Livro;

public class LivroService {
    private Validacoes validar= new Validacoes();
    public Livro criar(String titulo, String autor, String sinopse, byte[] capa){
        String tituloLimpo = validar.validarETratarTexto(titulo, "Titulo");
        String autorLimpo = validar.validarETratarTexto(autor, "Autor");
        String sinopseLimpo = validar.validarETratarTexto(sinopse, "Sinopse");

        return new Livro(tituloLimpo,  sinopseLimpo, autorLimpo, capa);
    }
}
