package org.Esercizio5;

public class ViaggioTreno extends Viaggio{
    private String compagniaTreno;
    private int numeroPosto;
    private boolean prenotato = false;
    public ViaggioTreno(String destinazione, double prezzo, String compagniaTreno, int numeroPosto) {
        super(destinazione, prezzo);
        this.compagniaTreno = compagniaTreno;
        this.numeroPosto = numeroPosto;
    }
    public String getCompagniaTreno() {
        return compagniaTreno;
    }
    public int getNumeroPosto() {
        return numeroPosto;
    }
    @Override
    public void descrizione() {
        System.out.println("Viaggio in treno per " + getDestinazione() + " con " + compagniaTreno + " al prezzo di " + getPrezzo() + " euro.");
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
