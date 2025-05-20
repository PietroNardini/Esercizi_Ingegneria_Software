package com.example.Esercizi.ingsw.esercizio33;

public class AutoEs33 {
    private String targa;

    public AutoEs33(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    @Override
    public String toString() {
        return "Auto{" + "targa='" + targa + '\'' + '}';
    }
}
