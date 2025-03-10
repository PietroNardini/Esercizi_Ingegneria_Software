package org.Esercizio5;

public class ViaggioAereo extends Viaggio{
    private String compagniaAerea;
    private int numeroPosto;
    private boolean prenotato = false;
    public ViaggioAereo(String destinazione, double prezzo, String compagniaAerea, int numeroPosto) {
        super(destinazione, prezzo);
        this.compagniaAerea = compagniaAerea;
        this.numeroPosto = numeroPosto;
    }
    public String getCompagniaAerea() {
        return compagniaAerea;
    }
    public int getNumeroPosto() {
        return numeroPosto;
    }
    @Override

    public void descrizione() {
        System.out.println("Viaggio aereo per " + getDestinazione() + " con " + compagniaAerea + " al prezzo di " + getPrezzo() + " euro.");
    }
    public void prenota() {
        if (prenotato) {
            System.out.println("Viaggio già prenotato.");
        } else {
            prenotato = true;
            System.out.println("Viaggio prenotato.");
        }
    }

}
