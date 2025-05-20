package com.example.Esercizi.ingsw.esercizio22;

public class OrdineNegozio implements Spedibile {
    private String idOrdine;

    public OrdineNegozio(String idOrdine) {
        this.idOrdine = idOrdine;
    }

    @Override
    public void spedizione() {
        System.out.println("Ordine in Negozio " + idOrdine + ": ritiro in negozio.");
    }
}
