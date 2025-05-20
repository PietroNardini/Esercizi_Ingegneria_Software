package com.example.Esercizi.ingsw.esercizio22;

public class OrdineOnline implements Spedibile {
    private String idOrdine;

    public OrdineOnline(String idOrdine) {
        this.idOrdine = idOrdine;
    }

    @Override
    public void spedizione() {
        System.out.println("Ordine Online " + idOrdine + ": spedizione tramite corriere.");
    }
}

