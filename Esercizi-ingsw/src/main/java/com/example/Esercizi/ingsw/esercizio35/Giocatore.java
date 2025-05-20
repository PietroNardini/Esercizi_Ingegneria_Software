package com.example.Esercizi.ingsw.esercizio35;

public class Giocatore {
    private String nome;
    private int punteggio;

    public Giocatore(String nome) {
        this.nome = nome;
        this.punteggio = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void aggiungiPunteggio(int punti) {
        this.punteggio += punti;
    }

    public void resetPunteggio() {
        this.punteggio = 0;
    }
}
