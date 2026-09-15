package com.minhaestante.domain.model;

public class Livro {
        private String titulo;
        private String sinopse;
        private String autor;
        private int paginas;
        private byte[] capa;

    public Livro(String titulo, String sinopse, String autor, int paginas, byte[] capa) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.autor = autor;
        this.paginas = paginas;
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\n | " + "Sinopse: " + getSinopse() + "\n | " + " Autor " + getAutor() + "\n | " + " Paginas: " + getPaginas();
    }
}
