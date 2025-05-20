package com.example.Esercizi.ingsw.esercizio29;

import java.util.List;

public class Canzone {
    private String titolo;
    private String artista;
    private int durata; // durata in secondi

    public Canzone(String titolo, String artista, int durata) {
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public static int calcolaDurataTotale(List<Canzone> canzoni) {
        int totale = 0;
        for (Canzone c : canzoni) {
            totale += c.getDurata();
        }
        return totale;
    }

    @Override
    public String toString() {
        return titolo + " - " + artista + " (" + durata + "s)";
    }
}
