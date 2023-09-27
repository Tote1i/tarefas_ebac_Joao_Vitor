
package com.ebac.streams;

public class Contato {
    private final String nome;
    private final String genero;

    public Contato(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}

