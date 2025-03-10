/*
Esercizio 4: Gestione Dipendenti (Ereditarietà e Liste)
Crea un sistema per gestire i dipendenti di un'azienda.
Requisiti:
Crea una classe astratta Dipendente con attributi nome, stipendio e un metodo astratto calcolaStipendio().
Crea due classi Impiegato e Manager, che ereditano da Dipendente.
Un impiegato ha uno stipendio fisso.
Un manager ha uno stipendio fisso più un bonus.
Implementa una classe Azienda che memorizza i dipendenti in una lista e stampa gli stipendi totali.

 */
package org.Esercizio4;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List <Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(new Impiegato("Pietro Nardini", 1500));
        dipendenti.add(new Manager("Pietro Bianchi", 2000, 500));
        for (Dipendente elem: dipendenti){
            System.out.println(elem.getNome() + " " + elem.calcolaStipendio());
        }
    }
}
