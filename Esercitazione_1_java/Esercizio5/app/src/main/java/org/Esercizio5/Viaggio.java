package org.Esercizio5;

public abstract class Viaggio {
    private String destinazione;
    private double prezzo;
    public Viaggio(String destinazione, double prezzo) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
    }
    public String getDestinazione() {
        return destinazione;
    }   
    public double getPrezzo() {
        return prezzo;
    }
    public abstract void descrizione();
    public abstract void prenota();
}
