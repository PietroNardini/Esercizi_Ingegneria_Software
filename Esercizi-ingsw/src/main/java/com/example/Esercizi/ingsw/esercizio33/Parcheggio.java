package com.example.Esercizi.ingsw.esercizio33;

public class Parcheggio {
private PostoAuto[] posti;

    public Parcheggio(int numeroPosti) {
        posti = new PostoAuto[numeroPosti];
        for (int i = 0; i < numeroPosti; i++) {
            posti[i] = new PostoAuto();
        }
    }

    public boolean entra(AutoEs33 a) {
        for (PostoAuto p : posti) {
            if (!p.isOccupato()) {
                p.entraAuto(a);
                return true;
            }
        }
        return false;
    }

    public boolean esci(String targa) {
        for (PostoAuto p : posti) {
            if (p.isOccupato() && p.getAuto().getTarga().equals(targa)) {
                p.esciAuto();
                return true;
            }
        }
        return false;
    }

    public void stampaStato() {
        for (int i = 0; i < posti.length; i++) {
            System.out.println("Posto " + (i + 1) + ": " + posti[i]);
        }
    }
}
