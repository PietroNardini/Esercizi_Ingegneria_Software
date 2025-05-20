package com.example.Esercizi.ingsw.esercizio33;

public class PostoAuto {
    private AutoEs33 auto;

    public boolean isOccupato() {
        return auto != null;
    }

    public void entraAuto(AutoEs33 a) {
        this.auto = a;
    }

    public void esciAuto() {
        this.auto = null;
    }

    public AutoEs33 getAuto() {
        return auto;
    }

    @Override
    public String toString() {
        return isOccupato() ? auto.toString() : "Posto libero";
    }
}
