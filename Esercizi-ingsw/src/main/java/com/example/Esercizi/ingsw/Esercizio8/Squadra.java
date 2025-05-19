package com.example.Esercizi.ingsw.Esercizio8;

public class Squadra implements Comparable<Squadra> {
    private String nome;
    private int punti;

    public Squadra(String nome, int punti) {
        this.nome = nome;
        this.punti = punti;
    }

    public String getNome() {
        return nome;
    }

    public int getPunti() {
        return punti;
    }

    @Override
    public int compareTo(Squadra altra) {
        return Integer.compare(altra.punti, this.punti);
    }

    @Override
    public String toString() {
        return nome + " - " + punti + " punti";
    }
}
