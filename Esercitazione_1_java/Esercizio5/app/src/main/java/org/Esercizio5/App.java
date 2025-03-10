/*
Creiamo un sistema per gestire prenotazioni di diversi tipi di viaggi.
Requisiti:
Crea un'interfaccia Prenotabile con un metodo prenota().
Crea una classe astratta Viaggio con attributi come destinazione, prezzo e un metodo descrizione().
Implementa due classi ViaggioAereo e ViaggioTreno, con caratteristiche specifiche (es. compagniaAerea, numeroPosto).
Gestisci le prenotazioni con una classe SistemaPrenotazioni che utilizza una List<Viaggio>.
Aggiungi gestione delle eccezioni per evitare la prenotazione di un viaggio già prenotato.
 */
package org.Esercizio5;

public class App {
  

    public static void main(String[] args) {
        SistemaPrenotazioni sistema = new SistemaPrenotazioni(); 
        ViaggioTreno vt = new ViaggioTreno("Roma", 50, "Trenitalia", 1);
        ViaggioAereo va = new ViaggioAereo("New York", 500, "Alitalia", 1);
        sistema.viaggi.add(vt);
        sistema.viaggi.add(va);
        sistema.prenota();
        sistema.printViaggi();
        }
}
