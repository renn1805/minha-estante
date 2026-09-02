package com.minhaestante.domain.model;

public class Livro {
    private String titulo;
    private String sinopse;
    private String autor;
    private byte[] capa;

    public Livro(String titulo, String sinopse, String autor, byte[] capa) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.autor = autor;
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }


}
