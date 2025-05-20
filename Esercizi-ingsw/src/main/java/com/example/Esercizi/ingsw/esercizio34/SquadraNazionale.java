package com.example.Esercizi.ingsw.esercizio34;

public class SquadraNazionale implements Comparable<SquadraNazionale> {
    private String nome;
    private int punti;

    public SquadraNazionale(String nome, int punti) {
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
    public int compareTo(SquadraNazionale altra) {
        // Ordinamento decrescente per punti
        return Integer.compare(altra.punti, this.punti);
    }

    @Override
    public String toString() {
        return nome + " - " + punti + " punti";
    }
}
