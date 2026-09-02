package main.java.com.minhaestante.domain.config;

import main.java.com.minhaestante.domain.model.Livro;

public class LivroService {
    private Validacoes validar= new Validacoes();
    public Livro criar(String titulo, String autor, String sinopse, byte[] capa){
        String tituloLimpo = validar.validarETratarTexto(titulo, "Titulo");
        String autorLimpo = validar.validarETratarTexto(autor, "Autor");
        String sinopseLimpo = validar.validarETratarTexto(sinopse, "Sinopse");

        return new Livro(tituloLimpo,  sinopseLimpo, autorLimpo, capa);
    }
}
