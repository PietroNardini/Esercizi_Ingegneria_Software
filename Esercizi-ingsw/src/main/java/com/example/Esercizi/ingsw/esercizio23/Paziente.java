package com.example.Esercizi.ingsw.esercizio23;

public class Paziente {
    private String nome;
    private String codiceFiscale;

    public Paziente(String nome, String codiceFiscale) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
}
