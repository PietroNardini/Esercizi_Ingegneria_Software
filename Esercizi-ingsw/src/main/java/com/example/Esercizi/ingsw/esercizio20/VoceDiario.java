package com.example.Esercizi.ingsw.esercizio20;

import java.time.LocalDate;

public class VoceDiario {
    private String testo;
    private LocalDate data;

    public VoceDiario(String testo, LocalDate data) {
        this.testo = testo;
        this.data = data;
    }

    public String getTesto() {
        return testo;
    }

    public LocalDate getData() {
        return data;
    }
}
