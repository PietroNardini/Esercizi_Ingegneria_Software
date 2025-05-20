package com.example.Esercizi.ingsw.esercizio28;

public class ProdottoMagazzino {
    protected String nome;
    protected double prezzo;

    public ProdottoMagazzino(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return nome + " - " + prezzo + "$";
    }
}
