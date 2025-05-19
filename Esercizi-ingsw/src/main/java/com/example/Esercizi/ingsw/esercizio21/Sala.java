package com.example.Esercizi.ingsw.esercizio21;

public class Sala {
    private String nome;
    private int postiTotali;
    private int postiPrenotati;

    public Sala(String nome, int postiTotali) {
        this.nome = nome;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPostiDisponibili() {
        return postiTotali - postiPrenotati;
    }

    public boolean prenotaPosti(int posti) {
        if (posti <= getPostiDisponibili()) {
            postiPrenotati += posti;
            return true;
        }
        return false;
    }
}


