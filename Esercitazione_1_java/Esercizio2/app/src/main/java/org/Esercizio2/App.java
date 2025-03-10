/*
Esercizio 2: Gestione Biblioteca (Liste ed Ereditarietà)
Crea un semplice sistema per gestire una biblioteca.
Definisci una classe astratta MaterialeBibliotecario con attributi titolo e annoPubblicazione.
Crea due classi che ereditano: Libro e Rivista. Aggiungi attributi specifici (es. autore per i libri, numeroEdizione per le riviste).
Implementa una classe Biblioteca che usa una List<MaterialeBibliotecario> per memorizzare i materiali.
Aggiungi metodi per aggiungere, rimuovere e visualizzare i materiali.
 */
package org.Esercizio2;

public class App {
    public static void main(String[] args) {
            Biblioteca biblio=new Biblioteca();
            biblio.aggiungiLibro(new Libro("Il signore degli anelli","1954","J.R.R. Tolkien"));
            biblio.aggiungiLibro(new Libro("Il signore degli tarzanelli","1984","J.R.R. Tolkien"));
            biblio.consultaCatalogo();
            biblio.removeLibro(new Libro("Il signore degli tarzanelli","1984","J.R.R. Tolkien"));
            biblio.aggiungiLibro(new Libro("La compagnia dell'anello","J.R.R. Tolkien"));
            biblio.removeLibro(new Libro("La fattoria degli animali","1984"));

            biblio.consultaCatalogo();

    }
}
