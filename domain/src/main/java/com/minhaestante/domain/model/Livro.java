package com.minhaestante.domain.model;

public class Livro {
        private String titulo;
        private String sinopse;
        private String autor;
        private int paginas;
        private byte[] capa;

    public Livro(String titulo, String sinopse, String autor, int paginas) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.autor = autor;
        this.paginas = paginas;
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
        return "Titulo: " + getTitulo() + " | " + "Sinopse: " + getSinopse() + " | " + " Autor " + getAutor() + " Paginas: " + getPaginas();
    }
}
