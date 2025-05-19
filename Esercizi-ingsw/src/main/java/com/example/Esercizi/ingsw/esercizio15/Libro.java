package com.example.Esercizi.ingsw.esercizio15;

public class Libro {
    private String titolo;
    private String autore;
    private int anno;

    public Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore + ", Anno: " + anno;
    }
}
